package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRecentGames @Inject constructor(
    private val gameRepository: GameRepository
) {
    operator fun invoke(): Flow<List<Game>> = gameRepository.getRecentGames()
}
