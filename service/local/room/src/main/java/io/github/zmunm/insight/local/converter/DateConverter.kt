package io.github.zmunm.insight.local.converter

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? = value?.let { Date(value) }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? = date?.time
}
