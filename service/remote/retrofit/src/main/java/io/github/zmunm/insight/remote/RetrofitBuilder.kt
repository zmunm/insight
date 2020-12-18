package io.github.zmunm.insight.remote

import com.orhanobut.logger.Logger
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

internal object RetrofitBuilder {
    private const val TAG = "OkHTTP"

    private const val TIME_OUT = 20_000L

    private const val CORE_POOL_SIZE = 5
    private const val MAXIMUM_POOL_SIZE = 30
    private const val KEEP_ALIVE_TIME = 15L

    fun build(): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder()
                    .add(KotlinJsonAdapterFactory())
                    .build()
            )
        )
        .callbackExecutor(
            ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAXIMUM_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                SynchronousQueue()
            )
        )
        .client(
            OkHttpClient.Builder()
                .readTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
                .connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
                .addInterceptor { chain ->
                    val originalRequest = chain.request()
                    chain.proceed(
                        originalRequest.newBuilder().url(
                            originalRequest.url.newBuilder()
                                .addQueryParameter("api_key", "a063413fad79f5e3f541212866818e15")
                                .build()
                        ).build()
                    )
                }
                .addInterceptor(
                    HttpLoggingInterceptor {
                        Logger.t(TAG).i(it)
                    }.setLevel(HttpLoggingInterceptor.Level.BODY)
                )
                .build()
        )
        .build()
}
