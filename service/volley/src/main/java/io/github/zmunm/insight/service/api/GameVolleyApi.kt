package io.github.zmunm.insight.service.api

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.VolleyError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.github.zmunm.insight.repository.KnownThrowable
import io.github.zmunm.insight.service.GsonRequest
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

    private fun <T> T.toSuccess() = Result.success(this)

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

    private inline fun <reified T> typeToken() = object : TypeToken<T>() {}

    suspend fun fetchGames(
        page: Int?,
    ): Result<ResponseList<ResponseGame>> = suspendCoroutine { cont ->
        requestQueue.add(
            GsonRequest<ResponseList<ResponseGame>>(
                Request.Method.GET,
                buildUrl("games", mapOf("page" to page)),
                typeToken(),
                null,
                { response ->
                    cont.resume(response.toSuccess())
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
            GsonRequest<ResponseGameDetail>(
                Request.Method.GET,
                buildUrl("games/$id"),
                typeToken(),
                null,
                { response ->
                    cont.resume(response.toSuccess())
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
