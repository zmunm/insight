package io.github.zmunm.insight.remote.api

import io.github.zmunm.insight.remote.dao.ResponseTopRated
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/top_rated")
    suspend fun fetchTopRated(
        @Query("page") page: Int?
    ): ResponseTopRated
}