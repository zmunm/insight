package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.GameRepository
import javax.inject.Inject

class GetGames @Inject constructor(
    private val gameRepository: GameRepository
) {
    suspend operator fun invoke(page: Int) = gameRepository.getGames(page.takeIf { it > 0 })
}
