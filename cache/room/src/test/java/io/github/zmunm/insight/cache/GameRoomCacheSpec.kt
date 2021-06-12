package io.github.zmunm.insight.cache

import io.github.zmunm.insight.cache.dao.GameRoomDao
import io.github.zmunm.insight.cache.table.TableGame
import io.github.zmunm.insight.cache.table.TableLike
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import io.github.zmunm.insight.repository.cache.GameCache
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldHaveSize
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
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flowOf

internal class GameRoomCacheSpec : DescribeSpec({
    val gameDao: GameRoomDao = mockk()

    val gameCache: GameCache by lazy {
        GameRoomCache(gameDao)
    }

    val id1 = 1L
    val id2 = 2L

    val tableGame = TableGame(
        id = id1,
        name = "name1",
        backgroundImage = "backgroundImage1"
    )

    val game = Game(
        id = id2,
        name = "name2",
        backgroundImage = "backgroundImage2"
    )

    describe("getGames") {
        var gameFlow: Flow<List<TableGame>> = emptyFlow()
        every { gameDao.getGames() } answers { gameFlow }

        it("empty") {
            gameFlow = emptyFlow()
            gameCache.getGames().collect {}
        }

        it("games") {
            gameFlow = flowOf(listOf(tableGame))
            gameCache.getGames().collect {
                it shouldHaveSize 1
            }
        }

        verify { gameDao.getGames() }
    }

    describe("getGame") {
        var gameFlow: Flow<TableGame> = emptyFlow()
        val idSlot = slot<Long>()
        every { gameDao.getGame(capture(idSlot)) } answers { gameFlow }

        it("empty") {
            gameFlow = emptyFlow()
            gameCache.getGame(id1).collect {}
            idSlot.captured shouldBe id1
        }

        it("game1") {
            gameFlow = flowOf(tableGame)
            gameCache.getGame(id1).collect {
                it.id shouldBe id1
            }
            idSlot.captured shouldBe id1
        }

        verify { gameDao.getGame(capture(idSlot)) }
    }

    describe("deleteAll") {
        coEvery { gameDao.deleteAll() } just Runs

        gameCache.deleteAll()

        coVerify { gameDao.deleteAll() }
    }

    describe("insertAll") {
        val slot = slot<List<TableGame>>()
        coEvery { gameDao.upsert(capture(slot)) } just Runs

        it("empty") {
            gameCache.insertAll(emptyList())
            slot.captured shouldHaveSize 0
        }

        it("game1") {
            gameCache.insertAll(listOf(game))
            slot.captured.single().id shouldBe id2
        }

        coVerify { gameDao.upsert(capture(slot)) }
    }

    describe("getLike") {
        var likeFlow: Flow<TableLike> = emptyFlow()
        val idSlot = slot<Long>()

        every { gameDao.getLikeFlow(capture(idSlot)) } answers { likeFlow }

        it("empty") {
            likeFlow = emptyFlow()
            gameCache.getLikeFlow(id1).collect {}
            idSlot.captured shouldBe id1
        }

        it("game1") {
            likeFlow = flowOf(TableLike(id1, true))
            gameCache.getLikeFlow(id1).collect {
                it.id shouldBe id1
            }
            idSlot.captured shouldBe id1
        }

        verify { gameDao.getLikeFlow(capture(idSlot)) }
    }

    describe("insertLike") {
        val slot = slot<TableLike>()
        coEvery { gameDao.insertLike(capture(slot)) } just Runs

        it("true") {
            gameCache.insertLike(Like(id1, true))
            slot.captured.like shouldBe true
        }

        it("false") {
            gameCache.insertLike(Like(id1, false))
            slot.captured.like shouldBe false
        }

        coVerify { gameDao.insertLike(capture(slot)) }
    }

    afterContainer {
        confirmVerified(gameDao)
        clearMocks(gameDao)
    }
})
