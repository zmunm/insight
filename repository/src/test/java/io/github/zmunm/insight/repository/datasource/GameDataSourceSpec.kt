package io.github.zmunm.insight.repository.datasource

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import io.github.zmunm.insight.repository.cache.GameCache
import io.github.zmunm.insight.repository.service.GameService
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.Runs
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.TestCoroutineDispatcher

internal class GameDataSourceSpec : DescribeSpec({
    val gameService: GameService = mockk()
    val gameCache: GameCache = mockk()
    val testDispatcher = TestCoroutineDispatcher()
    val gameDataSource = GameDataSource(
        gameService = gameService,
        gameCache = gameCache,
        dispatcher = testDispatcher,
    )

    describe("getGames") {
        val pageSlot = mutableListOf<Int?>()

        coEvery {
            gameService.fetchGames(captureNullable(pageSlot))
        } returns emptyList()

        it("unknown page") {
            gameDataSource.getGames(null)
            pageSlot.single() shouldBe null
        }

        it("page 1") {
            gameDataSource.getGames(1)
            pageSlot.single() shouldBe 1
        }

        coVerify {
            gameService.fetchGames(captureNullable(pageSlot))
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
            val id = 1L
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

    describe("deleteAll") {
        coEvery {
            gameCache.deleteAll()
        } just Runs

        gameDataSource.deleteAll()

        coVerify {
            gameCache.deleteAll()
        }
    }

    describe("get like flow") {
        val id = 1L

        every {
            gameCache.getLikeFlow(id)
        } returns flowOf(mockk())

        gameDataSource.getLikeFlow(id)

        verify {
            gameCache.getLikeFlow(id)
        }
    }

    describe("toggle like") {
        val id = 1L
        val game = Game(id, "name", "background")

        val gameSlot = slot<Game>()
        val idSlot = slot<Long>()
        val likeSlot = slot<Like>()

        var like: Like? = null

        coEvery { gameCache.putGame(capture(gameSlot)) } just Runs
        coEvery { gameCache.getLike(capture(idSlot)) } answers { like }
        coEvery { gameCache.insertLike(capture(likeSlot)) } just Runs

        it("first like") {
            like = null
            gameDataSource.toggleLike(game)
            gameSlot.captured shouldBe game
            idSlot.captured shouldBe id
            likeSlot.captured.like shouldBe true
        }

        it("true") {
            like = Like(id, true)
            gameDataSource.toggleLike(game)
            gameSlot.captured shouldBe game
            idSlot.captured shouldBe id
            likeSlot.captured.like shouldBe false
        }

        it("false") {
            like = Like(id, false)
            gameDataSource.toggleLike(game)
            gameSlot.captured shouldBe game
            idSlot.captured shouldBe id
            likeSlot.captured.like shouldBe true
        }

        coVerify {
            gameCache.putGame(capture(gameSlot))
            gameCache.getLike(capture(idSlot))
            gameCache.insertLike(capture(likeSlot))
        }
    }

    afterContainer {
        confirmVerified(
            gameService,
            gameCache,
        )
        clearMocks(
            gameService,
            gameCache,
        )
        testDispatcher.cleanupTestCoroutines()
    }
})
