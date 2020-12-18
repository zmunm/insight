package io.github.zmunm.insight.remote.api

import com.orhanobut.logger.Logger
import io.github.zmunm.insight.remote.dao.ResponseTopRated
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*

internal class MovieApi(
    private val client: HttpClient
) {
    suspend fun fetchTopRated(
        page: Int?
    ): ResponseTopRated {
        val response = client.request<ResponseTopRated>("${baseUrl}movie/top_rated?page=$page&api_key=$token") {
            method = HttpMethod.Get
            headers {
                append("sample-header", "HeaderValue")
            }
        }

        Logger.i(response.toString())

        return response
    }

    companion object {
        const val baseUrl = "https://api.themoviedb.org/3/"
        const val token = "a063413fad79f5e3f541212866818e15"
    }
}
