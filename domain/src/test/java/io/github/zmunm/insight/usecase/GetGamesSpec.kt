package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.mockk

internal class GetGamesSpec : DescribeSpec({
    val gameRepository: GameRepository = mockk()
    val getGames = GetGames(
        gameRepository = gameRepository
    )

    describe("get games by page") {
        val pageSlot = mutableListOf<Int?>()
        val gameList = mockk<List<Game>>()

        coEvery {
            gameRepository.getGames(captureNullable(pageSlot))
        } returns gameList

        it("page 0") {
            getGames(0)
            pageSlot.single() shouldBe null
        }

        it("page -1") {
            getGames(-1)
            pageSlot.single() shouldBe null
        }

        it("page 2") {
            getGames(2)
            pageSlot.single() shouldBe 2
        }

        coVerify(exactly = 1) {
            gameRepository.getGames(captureNullable(pageSlot))
        }
    }

    afterContainer {
        confirmVerified(gameRepository)
        clearMocks(gameRepository)
    }
})
