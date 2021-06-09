package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
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
        it("page 0") {
            coEvery {
                gameRepository.getGames(null)
            } returns emptyList()

            getGames(0)

            coVerify(exactly = 1) {
                gameRepository.getGames(null)
            }
        }

        it("page -1") {
            coEvery {
                gameRepository.getGames(null)
            } returns emptyList()

            getGames(-1)

            coVerify(exactly = 1) {
                gameRepository.getGames(null)
            }
        }

        it("page 2") {
            coEvery {
                gameRepository.getGames(2)
            } returns emptyList()

            getGames(2)

            coVerify(exactly = 1) {
                gameRepository.getGames(2)
            }
        }
    }

    afterTest {
        confirmVerified(
            gameRepository
        )
        clearMocks(
            gameRepository
        )
    }
})
