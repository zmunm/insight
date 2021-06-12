package io.github.zmunm.insight.cache

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.cache.dao.GameRealmDao
import io.github.zmunm.insight.repository.cache.GameCache
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun provideGameService(): GameCache = GameRealmCache(
        GameRealmDao()
    )
}
