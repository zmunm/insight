package io.github.zmunm.insight.local.impl

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.local.dao.GameDao
import io.github.zmunm.insight.local.table.GameTable
import io.github.zmunm.insight.repository.service.GameCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

internal class GameCacheImpl(
    private val gameDao: GameDao
) : GameCache {

    override suspend fun getGames(): Flow<List<Game>> = gameDao.getGames().map { list ->
        list.map {
            Game(
                it.id,
                it.title
            )
        }
    }

    override suspend fun getGame(id: Int): Flow<Game> = gameDao.getGame(id).map {
        Game(
            it.id,
            it.title
        )
    }

    override suspend fun insertAll(games: List<Game>) = gameDao.insertAll(
        games.map {
            GameTable(
                it.id,
                it.name
            )
        }
    )
}
