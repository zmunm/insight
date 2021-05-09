package io.github.zmunm.insight.local.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.local.dao.GameDao
import io.github.zmunm.insight.local.impl.GameCacheImpl
import io.github.zmunm.insight.repository.service.GameCache
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun provideGameService(): GameCache = GameCacheImpl(
        GameDao()
    )
}
