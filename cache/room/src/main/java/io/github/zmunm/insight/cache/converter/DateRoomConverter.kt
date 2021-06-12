package io.github.zmunm.insight.cache.converter

import androidx.room.TypeConverter
import java.util.Date

internal class DateRoomConverter {
    @TypeConverter
    fun toDate(value: Long): Date = Date(value)

    @TypeConverter
    fun fromDate(date: Date): Long = date.time
}
