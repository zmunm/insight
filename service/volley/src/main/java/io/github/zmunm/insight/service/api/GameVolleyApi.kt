package io.github.zmunm.insight.service.api

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.github.zmunm.insight.repository.KnownThrowable
import io.github.zmunm.insight.service.dao.ResponseError
import io.github.zmunm.insight.service.dao.ResponseGame
import io.github.zmunm.insight.service.dao.ResponseGameDetail
import io.github.zmunm.insight.service.dao.ResponseList
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

internal class GameVolleyApi(
    private val requestQueue: RequestQueue,
    private val url: String,
    apiKey: String,
) {
    private val gson = Gson()
    private val keyPostFix = "&key=$apiKey"

    private fun <T> VolleyError.toFailure() =
        Result.failure<T>(
            KnownThrowable(
                gson.fromJson(
                    networkResponse.data.decodeToString(),
                    ResponseError::class.java
                ).error,
                this
            )
        )

    suspend fun fetchGames(
        page: Int?,
    ): Result<ResponseList<ResponseGame>> = suspendCoroutine { cont ->
        requestQueue.add(
            StringRequest(
                Request.Method.GET,
                buildUrl("games", mapOf("page" to page)),
                { response ->
                    cont.resume(
                        Result.success(
                            gson.fromJson(
                                response,
                                object : TypeToken<ResponseList<ResponseGame>>() {}.type
                            )
                        )
                    )
                },
                {
                    cont.resume(it.toFailure())
                }
            )
        )
    }

    suspend fun fetchGameDetail(
        id: Long,
    ): Result<ResponseGameDetail> = suspendCoroutine { cont ->
        requestQueue.add(
            StringRequest(
                Request.Method.GET,
                buildUrl("games/$id"),
                { response ->
                    cont.resume(
                        Result.success(
                            gson.fromJson(
                                response,
                                ResponseGameDetail::class.java
                            )
                        )
                    )
                },
                {
                    cont.resume(it.toFailure())
                }
            )
        )
    }

    private fun buildUrl(
        endpoint: String,
        query: Map<String, Any?> = emptyMap(),
    ): String =
        buildString {
            append("$url$endpoint?")
            append(
                query.entries.joinToString(
                    separator = "&",
                    postfix = keyPostFix
                ) { (key, value) ->
                    "$key=$value"
                }
            )
        }
}
