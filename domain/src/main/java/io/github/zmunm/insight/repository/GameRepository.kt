package io.github.zmunm.insight.repository

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import kotlinx.coroutines.flow.Flow

interface GameRepository {
    suspend fun getGames(page: Int?): List<Game>

    fun getRecentGames(): Flow<List<Game>>

    fun getGameDetail(id: Long): Flow<Game>

    suspend fun insertAll(games: List<Game>)

    suspend fun deleteAll()

    fun getLikeFlow(id: Long): Flow<Like>

    suspend fun toggleLike(game: Game)
}
