package io.github.zmunm.insight.repository

import io.github.zmunm.insight.entity.Game
import kotlinx.coroutines.flow.Flow

interface GameRepository {
    suspend fun getGames(page: Int?): List<Game>

    suspend fun getRecentGames(): Flow<List<Game>>

    suspend fun getGameDetail(id: Int): Game?

    suspend fun insertAll(games: List<Game>)
}
