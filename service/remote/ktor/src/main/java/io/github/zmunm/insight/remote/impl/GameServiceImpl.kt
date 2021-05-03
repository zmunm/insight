package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.remote.api.GameApi
import io.github.zmunm.insight.repository.service.GameService

internal class GameServiceImpl(
    private val gameApi: GameApi,
) : GameService {
    override suspend fun fetchGames(page: Int?): List<Game> {
        TODO("Not yet implemented")
    }
}
