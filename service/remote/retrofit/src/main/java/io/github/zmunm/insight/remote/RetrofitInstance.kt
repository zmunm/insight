package io.github.zmunm.insight.remote

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

internal object RetrofitInstance {
    private const val TAG = "OkHTTP"

    private const val TIME_OUT = 20_000L

    private const val CORE_POOL_SIZE = 5
    private const val MAXIMUM_POOL_SIZE = 30
    private const val KEEP_ALIVE_TIME = 15L

    operator fun invoke(
        apiKey: String,
    ): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.rawg.io/api/")
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
                                .addQueryParameter("key", apiKey)
                                .build()
                        ).build()
                    )
                }
                .addInterceptor(
                    HttpLoggingInterceptor {
                        Timber.tag(TAG).d(it)
                    }.setLevel(HttpLoggingInterceptor.Level.BODY)
                )
                .build()
        )
        .build()
}
