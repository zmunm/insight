package io.github.zmunm.insight.cache.converter

import androidx.room.TypeConverter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

internal class StringListConverter {
    private val moshi: Moshi by lazy {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }
    private val adapter: JsonAdapter<List<String>> = moshi.adapter(
        Types.newParameterizedType(MutableList::class.java, String::class.java)
    )

    @TypeConverter
    fun deserialize(value: String): List<String> = adapter.fromJson(value) ?: emptyList()

    @TypeConverter
    fun serialize(date: List<String>): String = adapter.toJson(date)
}
