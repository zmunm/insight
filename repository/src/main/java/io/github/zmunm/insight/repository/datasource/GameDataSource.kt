package io.github.zmunm.insight.repository.datasource

import android.annotation.SuppressLint
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import io.github.zmunm.insight.repository.KnownThrowable
import io.github.zmunm.insight.repository.cache.GameCache
import io.github.zmunm.insight.repository.service.GameService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import timber.log.Timber

internal class GameDataSource(
    private val gameService: GameService,
    private val gameCache: GameCache,
    private val dispatcher: CoroutineDispatcher,
) : GameRepository {
    override suspend fun getGames(page: Int?): List<Game> = gameService.fetchGames(page)

    override fun getRecentGames(): Flow<List<Game>> = gameCache.getGames()

    override fun getGameDetail(id: Long): Flow<Game> {
        CoroutineScope(dispatcher).launch {
            if (!gameCache.hasGame(id)) {
                refreshGameDetail(id)
            }
        }
        return gameCache.getGame(id)
    }

    override suspend fun insertAll(games: List<Game>) {
        gameCache.insertAll(games)
    }

    @SuppressLint("TimberExceptionLogging")
    private suspend fun refreshGameDetail(id: Long) {
        gameService.fetchGameDetail(id)
            .onSuccess {
                gameCache.putGame(it)
            }
            .onFailure {
                if (it is KnownThrowable) {
                    Timber.i(it.message)
                } else {
                    Timber.e(it)
                }
            }
    }
}
