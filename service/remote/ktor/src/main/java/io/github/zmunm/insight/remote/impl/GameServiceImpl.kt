package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.remote.api.GameApi
import io.github.zmunm.insight.repository.service.GameService

internal class GameServiceImpl(
    private val gameApi: GameApi,
) : GameService {
    override suspend fun fetchGames(page: Int?): List<Game> =
        gameApi.fetchGames(page).results.map { response ->
            Game(
                response.id,
                response.name,
                response.background_image,
            )
        }

    override suspend fun fetchGameDetail(id: Int): Game =
        gameApi.fetchGameDetail(id).let { detail ->
            Game(
                detail.id,
                detail.name,
                detail.background_image
            )
        }
}
