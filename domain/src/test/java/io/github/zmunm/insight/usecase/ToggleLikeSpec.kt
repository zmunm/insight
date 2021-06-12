package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.Runs
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.just
import io.mockk.mockk
import io.mockk.slot

internal class ToggleLikeSpec : DescribeSpec({
    val gameRepository: GameRepository = mockk()
    val toggleLike = ToggleLike(
        gameRepository = gameRepository
    )

    describe("toggle like") {
        val id = 1L
        val gameSlot = slot<Game>()
        coEvery { gameRepository.toggleLike(capture(gameSlot)) } just Runs

        val game = Game(
            id,
            "name",
            "background",
        )
        toggleLike(game)
        gameSlot.captured shouldBe game

        coVerify(exactly = 1) { gameRepository.toggleLike(capture(gameSlot)) }
    }

    afterContainer {
        confirmVerified(gameRepository)
        clearMocks(gameRepository)
    }
})
