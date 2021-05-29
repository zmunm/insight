package io.github.zmunm.insight.service.api

import io.github.zmunm.insight.repository.KnownThrowable
import io.github.zmunm.insight.service.dao.ResponseError
import io.github.zmunm.insight.service.dao.ResponseGame
import io.github.zmunm.insight.service.dao.ResponseGameDetail
import io.github.zmunm.insight.service.dao.ResponseList
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.ClientRequestException
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.observer.ResponseObserver
import io.ktor.client.request.request
import io.ktor.client.statement.readText
import io.ktor.http.HttpMethod
import io.ktor.utils.io.readUTF8Line
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import timber.log.Timber

internal class GameKtorApi(
    private val url: String,
    apiKey: String,
) {
    private val keyPostFix = "&key=$apiKey"

    private val jsonOption =
        Json {
            isLenient = false
            ignoreUnknownKeys = true
            allowSpecialFloatingPointValues = true
            useArrayPolymorphism = false
        }

    private val client =
        HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(jsonOption)
            }

            install(ResponseObserver) {
                onResponse { response ->
                    Timber.d("HTTP status: ${response.status.value}")
                    Timber.d(response.content.readUTF8Line())
                }
            }
        }

    suspend fun fetchGames(page: Int?): Result<ResponseList<ResponseGame>> =
        buildRequest {
            client.request(
                buildUrl("games", mapOf("page" to page))
            ) {
                Timber.d(url.buildString())
                method = HttpMethod.Get
            }
        }

    suspend fun fetchGameDetail(id: Long): Result<ResponseGameDetail> =
        buildRequest {
            client.request(
                buildUrl("games/$id")
            ) {
                Timber.d(url.buildString())
                method = HttpMethod.Get
            }
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

    private suspend fun <T> buildRequest(action: suspend () -> T): Result<T> =
        try {
            Result.success(action())
        } catch (exception: ClientRequestException) {
            Result.failure(
                KnownThrowable(
                    jsonOption.decodeFromString<ResponseError>(
                        exception.response.readText()
                    ).error,
                    exception
                )
            )
        }
}
