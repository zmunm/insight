package io.github.zmunm.insight.service.api

import io.github.zmunm.insight.service.dao.ResponseGame
import io.github.zmunm.insight.service.dao.ResponseGameDetail
import io.github.zmunm.insight.service.dao.ResponseList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface GameApi {
    @GET("games")
    suspend fun fetchGames(
        @Query("page") page: Int?,
    ): Response<ResponseList<ResponseGame>>

    @GET("games/{$ID}")
    suspend fun fetchGameDetail(
        @Path(ID) id: Long,
    ): Response<ResponseGameDetail>

    companion object {
        private const val ID = "ID"
    }
}
