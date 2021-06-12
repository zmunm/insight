package io.github.zmunm.insight.cache.table

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "likes",
    foreignKeys = [
        ForeignKey(
            entity = TableGame::class,
            parentColumns = ["id"],
            childColumns = ["id"],
            onDelete = ForeignKey.CASCADE,
        )
    ]
)
internal data class TableLike(
    @PrimaryKey
    val id: Long,
    val like: Boolean,
)
