package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import javax.inject.Inject

class ToggleLike @Inject constructor(
    private val gameRepository: GameRepository,
) {
    suspend operator fun invoke(game: Game) {
        gameRepository.toggleLike(game)
    }
}
