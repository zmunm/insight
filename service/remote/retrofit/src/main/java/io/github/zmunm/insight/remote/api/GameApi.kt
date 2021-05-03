package io.github.zmunm.insight.remote.api

import io.github.zmunm.insight.remote.dao.ResponseGameList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

internal interface GameApi {
    @GET("games")
    suspend fun fetchGames(
        @Query("page") page: Int?
    ): Response<ResponseGameList>
}
