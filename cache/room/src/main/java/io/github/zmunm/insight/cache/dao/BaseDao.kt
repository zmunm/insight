package io.github.zmunm.insight.cache.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Transaction
import androidx.room.Update
import io.github.zmunm.insight.cache.table.TableGame

@Dao
internal abstract class BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun insert(item: T): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun insert(items: List<T>): List<Long>

    @Update
    abstract suspend fun update(item: T)

    @Update
    abstract suspend fun update(item: List<T>)

    @Transaction
    open suspend fun upsert(item: T) {
        if (insert(item) == -1L) {
            update(item)
        }
    }

    @Transaction
    open suspend fun upsert(items: List<T>) {
        val insertResult = insert(items)
        val updateList = mutableListOf<T>()

        for (i in insertResult.indices) {
            if (insertResult[i] == -1L) {
                updateList.add(items[i])
            }
        }

        if (updateList.isNotEmpty()) {
            update(updateList)
        }
    }

    @Delete
    abstract suspend fun delete(game: TableGame)
}
