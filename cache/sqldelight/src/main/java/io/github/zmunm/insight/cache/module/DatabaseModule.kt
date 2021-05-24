package io.github.zmunm.insight.cache.module

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.DelightDatabase
import io.github.zmunm.insight.cache.impl.GameCacheImpl
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
    ): GameCache = GameCacheImpl(
        AndroidSqliteDriver(DelightDatabase.Schema, context, "DATABASE.db")
    )
}
