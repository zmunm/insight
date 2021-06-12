package io.github.zmunm.insight.service

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber
import java.util.Date

internal object RetrofitInstance {
    private const val TAG = "OkHTTP"

    private val moshi: Moshi by lazy {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(Date::class.java, Rfc3339DateJsonAdapter())
            .build()
    }

    operator fun invoke(
        baseUrl: String,
        apiKey: String,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(
            OkHttpClient.Builder()
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
