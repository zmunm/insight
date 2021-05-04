package io.github.zmunm.insight.repository.datasource

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import io.github.zmunm.insight.repository.service.GameCache
import io.github.zmunm.insight.repository.service.GameService
import kotlinx.coroutines.flow.Flow

internal class GameDataSource(
    private val gameService: GameService,
    private val gameCache: GameCache
) : GameRepository {
    override suspend fun getGames(page: Int?): List<Game> = gameService.fetchGames(page)

    override suspend fun getRecentGames(): Flow<List<Game>> = gameCache.getGames()

    override suspend fun getGameDetail(id: Int): Game? = gameService.fetchGameDetail(id)

    override suspend fun insertAll(games: List<Game>) {
        gameCache.insertAll(games)
    }
}
