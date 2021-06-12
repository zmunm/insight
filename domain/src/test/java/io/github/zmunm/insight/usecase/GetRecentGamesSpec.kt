package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.mockk

internal class GetRecentGamesSpec : DescribeSpec({
    val gameRepository: GameRepository = mockk()
    val getRecentGames = GetRecentGames(
        gameRepository = gameRepository
    )

    describe("get recent games") {
        it("no-op") {
            coEvery {
                gameRepository.getRecentGames()
            } returns mockk()

            getRecentGames()

            coVerify(exactly = 1) {
                gameRepository.getRecentGames()
            }
        }
    }

    afterContainer {
        confirmVerified(gameRepository)
        clearMocks(gameRepository)
    }
})
