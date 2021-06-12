package io.github.zmunm.insight.cache

import io.github.zmunm.insight.cache.dao.GameRoomDao
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import io.github.zmunm.insight.repository.cache.GameCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map

internal class GameRoomCache(
    private val gameDao: GameRoomDao,
) : GameCache {

    override fun getGames(): Flow<List<Game>> = gameDao.getGames()
        .map { list ->
            list.map {
                it.toEntity()
            }
        }

    override fun getGame(id: Long): Flow<Game> = gameDao.getGame(id)
        .filterNotNull().map {
            it.toEntity()
        }

    override suspend fun putGame(game: Game) {
        gameDao.upsert(game.toTable())
    }

    override suspend fun hasGame(
        id: Long,
        timeout: Long,
    ): Boolean = gameDao.hasGame(id, timeout)

    override suspend fun insertAll(games: List<Game>) = gameDao.upsert(
        games.map {
            it.toTable()
        }
    )

    override suspend fun deleteAll() {
        gameDao.deleteAll()
    }

    override suspend fun getLike(id: Long): Like? =
        gameDao.getLike(id)?.toEntity()

    override fun getLikeFlow(id: Long): Flow<Like> = gameDao.getLikeFlow(id)
        .filterNotNull().map {
            it.toEntity()
        }

    override suspend fun insertLike(like: Like) {
        gameDao.insertLike(
            like.toTable()
        )
    }
}
