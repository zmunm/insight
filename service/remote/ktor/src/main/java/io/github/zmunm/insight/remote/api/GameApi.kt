package io.github.zmunm.insight.remote.api

import io.github.zmunm.insight.remote.dao.ResponseGame
import io.github.zmunm.insight.remote.dao.ResponseGameDetail
import io.github.zmunm.insight.remote.dao.ResponseList
import io.ktor.client.HttpClient
import io.ktor.client.request.request
import io.ktor.http.HttpMethod
import timber.log.Timber

internal class GameApi(
    apiKey: String,
    private val client: HttpClient,
) {
    private val keyPostFix = "&key=$apiKey"

    suspend fun fetchGames(page: Int?): ResponseList<ResponseGame> =
        client.request<ResponseList<ResponseGame>>(
            buildUrl("games", mapOf("page" to page))
        ) {
            Timber.d(url.buildString())
            method = HttpMethod.Get
        }.log()

    suspend fun fetchGameDetail(id: Int): ResponseGameDetail =
        client.request<ResponseGameDetail>(
            buildUrl("games/$id")
        ) {
            method = HttpMethod.Get
        }.log()

    private fun buildUrl(
        endpoint: String,
        query: Map<String, Any?> = emptyMap(),
    ): String {
        val builder = StringBuilder("$BASE_URL$endpoint?")
        builder.append(
            query.entries.joinToString(
                separator = "&",
                postfix = keyPostFix
            ) { (key, value) ->
                "$key=$value"
            }
        )
        return builder.toString()
    }

    private fun <T> T.log() = apply {
        Timber.d(this.toString())
    }

    companion object {
        private const val BASE_URL = "https://api.rawg.io/api/"
    }
}
