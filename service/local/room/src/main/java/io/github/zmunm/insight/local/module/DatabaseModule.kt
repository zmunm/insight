package io.github.zmunm.insight.local.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.local.AppDatabase
import io.github.zmunm.insight.local.impl.MovieCacheImpl
import io.github.zmunm.insight.repository.service.MovieCache
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun provideMovieService(
        @ApplicationContext
        context: Context
    ): MovieCache = MovieCacheImpl(
        AppDatabase.getInstance(context).movieDao()
    )
}
