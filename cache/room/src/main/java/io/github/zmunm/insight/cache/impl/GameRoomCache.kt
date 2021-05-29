package io.github.zmunm.insight.cache.impl

import io.github.zmunm.insight.cache.dao.GameRoomDao
import io.github.zmunm.insight.cache.table.TableGame
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.service.GameCache
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
        gameDao.putGame(game.toTable())
    }

    override suspend fun hasGame(
        id: Long,
        timeout: Long,
    ): Boolean = gameDao.hasGame(id, timeout)

    override suspend fun insertAll(games: List<Game>) = gameDao.insertAll(
        games.map {
            it.toTable()
        }
    )

    private fun Game.toTable(): TableGame = TableGame(
        id = id,
        name = name,
        backgroundImage = backgroundImage,
    )

    private fun TableGame.toEntity(): Game = Game(
        id = id,
        name = name,
        backgroundImage = backgroundImage,
    )
}
