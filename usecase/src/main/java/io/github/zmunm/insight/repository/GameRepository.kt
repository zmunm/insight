package io.github.zmunm.insight.repository

import io.github.zmunm.insight.entity.Game
import kotlinx.coroutines.flow.Flow

interface GameRepository {
    suspend fun getGames(page: Int?): List<Game>

    fun getRecentGames(): Flow<List<Game>>

    fun getGameDetail(id: Int): Flow<Game>

    suspend fun insertAll(games: List<Game>)
}
