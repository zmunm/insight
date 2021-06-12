package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.mockk

internal class GetLikeSpec : DescribeSpec({
    val gameRepository: GameRepository = mockk()
    val getLike = GetLike(
        gameRepository = gameRepository
    )

    describe("get like by id") {
        it("by id") {
            val id = 1L
            coEvery {
                gameRepository.getLikeFlow(id)
            } returns mockk()

            getLike(id)

            coVerify(exactly = 1) {
                gameRepository.getLikeFlow(id)
            }
        }
    }

    afterContainer {
        confirmVerified(gameRepository)
        clearMocks(gameRepository)
    }
})
