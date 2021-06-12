package io.github.zmunm.insight.cache

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.DelightDatabase
import io.github.zmunm.insight.repository.cache.GameCache
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun provideGameService(
        @ApplicationContext
        context: Context
    ): GameCache = GameDelightCache(
        AndroidSqliteDriver(DelightDatabase.Schema, context, "DATABASE.db")
    )
}
