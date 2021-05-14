package io.github.zmunm.insight.repository.datasource

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.module.RepositoryModule
import io.github.zmunm.insight.repository.service.GameCache
import io.github.zmunm.insight.repository.service.GameService
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.Runs
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flowOf

internal class GameDataSourceSpec : DescribeSpec({
    val gameService: GameService = mockk()
    val gameCache: GameCache = mockk()
    val gameDataSource = RepositoryModule.provideGameRepository(
        gameService = gameService,
        gameCache = gameCache,
    )

    describe("getGames") {
        it("unknown page") {
            coEvery {
                gameService.fetchGames(null)
            } returns emptyList()
            gameDataSource.getGames(null)
            coVerify {
                gameService.fetchGames(null)
            }
        }
        it("page 1") {
            coEvery {
                gameService.fetchGames(1)
            } returns emptyList()
            gameDataSource.getGames(1)
            coVerify {
                gameService.fetchGames(1)
            }
        }
    }

    describe("getRecentGames") {
        coEvery {
            gameCache.getGames()
        } returns emptyFlow()
        gameDataSource.getRecentGames()
        coVerify {
            gameCache.getGames()
        }
    }

    describe("getGameDetail") {
        it("has cache") {
            val id = 1
            coEvery {
                gameCache.hasGame(id)
            } returns true
            every {
                gameCache.getGame(id)
            } returns flowOf(mockk())
            gameDataSource.getGameDetail(id)
            coVerify {
                gameCache.hasGame(id)
                gameCache.getGame(id)
            }
        }
        /* stuck in https://github.com/mockk/mockk/issues/485
        it("has not cache") {
            val id = 1
            val game = mockk<Game>()
            coEvery {
                gameCache.hasGame(id)
            } returns false
            coEvery {
                gameService.fetchGameDetail(id)
            } returns Result.success(game)
            coEvery {
                gameCache.putGame(game)
            } just Runs
            every {
                gameCache.getGame(id)
            } returns flowOf(mockk())
            gameDataSource.getGameDetail(id)
            coVerify {
                gameCache.hasGame(id)
                gameService.fetchGameDetail(id)
                gameCache.putGame(game)
                gameCache.getGame(id)
            }
        }
        */
    }

    describe("insertAll") {
        val list = listOf(mockk<Game>())
        coEvery {
            gameCache.insertAll(list)
        } just Runs
        gameDataSource.insertAll(list)
        coVerify {
            gameCache.insertAll(list)
        }
    }

    afterTest {
        confirmVerified(
            gameService,
            gameCache,
        )
        clearMocks(
            gameService,
            gameCache,
        )
    }
})
