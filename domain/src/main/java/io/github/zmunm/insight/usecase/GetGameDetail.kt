package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.GameRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetGameDetail @Inject constructor(
    private val gameRepository: GameRepository
) {
    operator fun invoke(id: Long): Flow<Game> = gameRepository.getGameDetail(id)
}
