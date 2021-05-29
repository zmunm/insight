package io.github.zmunm.insight.service.impl

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.service.GameService
import io.github.zmunm.insight.service.api.GameVolleyApi
import io.github.zmunm.insight.service.dao.ResponseGame
import io.github.zmunm.insight.service.dao.ResponseGameDetail

internal class GameVolleyService(
    private val gameApi: GameVolleyApi,
) : GameService {

    override suspend fun fetchGames(
        page: Int?,
    ): List<Game> = gameApi.fetchGames(page).getOrNull()?.run {
        results.map { it.toEntity() }
    } ?: emptyList()

    override suspend fun fetchGameDetail(
        id: Long,
    ): Result<Game> = gameApi.fetchGameDetail(id).map { it.toEntity() }

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
