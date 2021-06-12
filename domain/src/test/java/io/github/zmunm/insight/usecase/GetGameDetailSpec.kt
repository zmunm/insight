package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.mockk

internal class GetGameDetailSpec : DescribeSpec({
    val gameRepository: GameRepository = mockk()
    val getGameDetail = GetGameDetail(
        gameRepository = gameRepository
    )

    describe("get game detail by id") {
        it("id 1") {
            coEvery {
                gameRepository.getGameDetail(1)
            } returns mockk()

            getGameDetail(1)

            coVerify(exactly = 1) {
                gameRepository.getGameDetail(1)
            }
        }
    }

    afterContainer {
        confirmVerified(gameRepository)
        clearMocks(gameRepository)
    }
})
