package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.entity.Like
import io.github.zmunm.insight.repository.GameRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLike @Inject constructor(
    private val gameRepository: GameRepository,
) {
    operator fun invoke(id: Long): Flow<Like> = gameRepository.getLikeFlow(id)
}
