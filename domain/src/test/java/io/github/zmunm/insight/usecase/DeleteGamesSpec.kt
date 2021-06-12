package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.Runs
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.just
import io.mockk.mockk

internal class DeleteGamesSpec : DescribeSpec({
    val gameRepository: GameRepository = mockk()
    val deleteGames = DeleteGames(
        gameRepository = gameRepository
    )

    describe("put like") {
        coEvery { gameRepository.deleteAll() } just Runs

        deleteGames()

        coVerify(exactly = 1) { gameRepository.deleteAll() }
    }

    afterContainer {
        confirmVerified(gameRepository)
        clearMocks(gameRepository)
    }
})
