package io.github.zmunm.insight.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.github.zmunm.insight.local.table.GameTable
import kotlinx.coroutines.flow.Flow

@Dao
internal interface GameDao {
    @Query("SELECT * FROM games ORDER BY title")
    fun getGames(): Flow<List<GameTable>>

    @Query("SELECT * FROM games WHERE id = :id")
    fun getGame(id: Int): Flow<GameTable>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(plants: List<GameTable>)
}
