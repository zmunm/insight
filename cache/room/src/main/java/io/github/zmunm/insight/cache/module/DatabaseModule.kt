package io.github.zmunm.insight.cache.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.cache.AppDatabase
import io.github.zmunm.insight.cache.impl.GameRoomCache
import io.github.zmunm.insight.repository.service.GameCache
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun provideGameService(
        @ApplicationContext
        context: Context
    ): GameCache = GameRoomCache(
        AppDatabase.getInstance(context).gameDao()
    )
}
