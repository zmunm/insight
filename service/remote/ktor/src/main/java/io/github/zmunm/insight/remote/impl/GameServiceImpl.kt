package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.remote.api.GameApi
import io.github.zmunm.insight.remote.dao.ResponseGame
import io.github.zmunm.insight.remote.dao.ResponseGameDetail
import io.github.zmunm.insight.repository.service.GameService

internal class GameServiceImpl(
    private val gameApi: GameApi,
) : GameService {
    override suspend fun fetchGames(page: Int?): List<Game> =
        gameApi.fetchGames(page).results.map { response ->
            response.toEntity()
        }

    override suspend fun fetchGameDetail(id: Int): Result<Game> =
        Result.success(gameApi.fetchGameDetail(id).toEntity())

    private fun ResponseGame.toEntity(): Game = Game(
        id = id,
        name = name,
        backgroundImage = background_image,
    )

    private fun ResponseGameDetail.toEntity(): Game = Game(
        id = id,
        name = name,
        backgroundImage = background_image,
    )
}
