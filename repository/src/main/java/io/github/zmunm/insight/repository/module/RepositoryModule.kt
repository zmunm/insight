package io.github.zmunm.insight.repository.module

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.repository.GameRepository
import io.github.zmunm.insight.repository.datasource.GameDataSource
import io.github.zmunm.insight.repository.service.GameCache
import io.github.zmunm.insight.repository.service.GameService

@Module
@InstallIn(SingletonComponent::class)
internal object RepositoryModule {

    @Reusable
    @Provides
    fun provideGameRepository(
        gameService: GameService,
        gameCache: GameCache,
    ): GameRepository = GameDataSource(
        gameService,
        gameCache,
    )
}
