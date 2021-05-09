package io.github.zmunm.insight.local.impl

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.local.dao.GameDao
import io.github.zmunm.insight.local.table.TableGame
import io.github.zmunm.insight.repository.service.GameCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map

internal class GameCacheImpl(
    private val gameDao: GameDao,
) : GameCache {

    override fun getGames(): Flow<List<Game>> = gameDao.getGames()
        .map { list ->
            list.map {
                it.toEntity()
            }
        }

    override fun getGame(id: Int): Flow<Game> = gameDao.getGame(id)
        .filterNotNull().map {
            it.toEntity()
        }

    override suspend fun putGame(game: Game) {
        gameDao.putGame(game.toTable())
    }

    override suspend fun hasGame(
        id: Int,
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
