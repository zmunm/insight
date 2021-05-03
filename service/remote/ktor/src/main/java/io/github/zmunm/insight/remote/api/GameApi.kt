package io.github.zmunm.insight.remote.api

import io.ktor.client.HttpClient

internal class GameApi(
    private val client: HttpClient
) {
    suspend fun fetchTopRated(
        page: Int?
    ) {
//        val response = client.request<ResponseTopRated>("api") {
//            method = HttpMethod.Get
//            headers {
//                append("sample-header", "HeaderValue")
//            }
//        }
//
//        Timber.d(response.toString())
//
//        return response
        TODO()
    }
}
