package io.github.zmunm.insight.service.module

import android.content.Context
import com.android.volley.toolbox.Volley
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.Const
import io.github.zmunm.insight.repository.service.GameService
import io.github.zmunm.insight.service.api.GameVolleyApi
import io.github.zmunm.insight.service.impl.GameVolleyService
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    private const val BASE_URL = "https://api.rawg.io/api/"

    @Provides
    @Singleton
    fun provideGameService(
        @ApplicationContext
        context: Context,
        @Named(Const.API_KEY)
        apiKey: String,
    ): GameService = GameVolleyService(
        GameVolleyApi(
            Volley.newRequestQueue(context),
            BASE_URL,
            apiKey,
        )
    )
}
