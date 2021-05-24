package io.github.zmunm.insight.repository.service

import io.github.zmunm.insight.entity.Game

interface GameService {
    suspend fun fetchGames(
        page: Int?
    ): List<Game>

    suspend fun fetchGameDetail(
        id: Long
    ): Result<Game>
}
