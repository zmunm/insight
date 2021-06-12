package io.github.zmunm.insight.repository.cache

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import kotlinx.coroutines.flow.Flow
import java.util.concurrent.TimeUnit

interface GameCache {
    fun getGames(): Flow<List<Game>>

    fun getGame(id: Long): Flow<Game>

    suspend fun putGame(game: Game)

    suspend fun hasGame(
        id: Long,
        timeout: Long = FRESH_TIMEOUT,
    ): Boolean

    suspend fun insertAll(games: List<Game>)

    suspend fun deleteAll()

    suspend fun getLike(id: Long): Like?

    fun getLikeFlow(id: Long): Flow<Like>

    suspend fun insertLike(like: Like)

    companion object {
        val FRESH_TIMEOUT = TimeUnit.DAYS.toMillis(1)
    }
}
