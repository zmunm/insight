package io.github.zmunm.insight.local.table

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
internal data class MovieTable(
    @PrimaryKey val id: Int,
    val title: String,
)
