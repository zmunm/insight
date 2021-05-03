package io.github.zmunm.insight.repository.service

import io.github.zmunm.insight.entity.Game
import kotlinx.coroutines.flow.Flow

interface GameCache {
    suspend fun getGames(): Flow<List<Game>>

    suspend fun getGame(id: Int): Flow<Game>

    suspend fun insertAll(games: List<Game>)
}
