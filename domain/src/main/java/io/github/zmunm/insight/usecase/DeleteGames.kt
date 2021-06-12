package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import javax.inject.Inject

class DeleteGames @Inject constructor(
    private val gameRepository: GameRepository,
) {
    suspend operator fun invoke() {
        gameRepository.deleteAll()
    }
}
