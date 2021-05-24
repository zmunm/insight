package io.github.zmunm.insight.cache.table

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "games")
internal data class TableGame(
    @PrimaryKey val id: Long,
    val name: String,
    val backgroundImage: String,
    val addedAt: Date = Date(),
)
