package io.github.zmunm.insight.local.table

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games")
internal data class GameTable(
    @PrimaryKey val id: Int,
    val title: String,
    val backgroundImage: String
)
