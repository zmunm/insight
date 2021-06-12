package io.github.zmunm.insight.cache.converter

import com.squareup.sqldelight.ColumnAdapter
import java.util.Date

internal class DateConverter : ColumnAdapter<Date, Long> {
    override fun encode(value: Date) = value.time
    override fun decode(databaseValue: Long) = Date(databaseValue)
}
