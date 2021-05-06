package io.github.zmunm.insight.repository.datasource

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import io.github.zmunm.insight.repository.service.GameCache
import io.github.zmunm.insight.repository.service.GameService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

internal class GameDataSource(
    private val gameService: GameService,
    private val gameCache: GameCache
) : GameRepository {
    override suspend fun getGames(page: Int?): List<Game> = gameService.fetchGames(page)

    override fun getRecentGames(): Flow<List<Game>> = gameCache.getGames()

    override fun getGameDetail(id: Int): Flow<Game> {
        CoroutineScope(Dispatchers.IO).launch {
            if (!gameCache.hasGame(id)) {
                refreshGameDetail(id)
            }
        }
        return gameCache.getGame(id)
    }

    override suspend fun insertAll(games: List<Game>) {
        gameCache.insertAll(games)
    }

    private suspend fun refreshGameDetail(id: Int) {
        gameCache.putGame(gameService.fetchGameDetail(id))
    }
}
