package io.github.zmunm.insight.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.github.zmunm.insight.local.table.TableGame
import kotlinx.coroutines.flow.Flow
import java.util.Date

@Dao
internal interface GameDao {
    @Query("SELECT * FROM games ORDER BY name")
    fun getGames(): Flow<List<TableGame>>

    @Query("SELECT * FROM games WHERE id = :id")
    fun getGame(id: Int): Flow<TableGame>

    @Query(
        """
        SELECT EXISTS(
            SELECT :now FROM games WHERE id = :id AND addedAt + :timeout > :now LIMIT 1
        )
        """
    )
    suspend fun hasGame(id: Int, timeout: Long, now: Date = Date()): Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun putGame(game: TableGame)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(games: List<TableGame>)

    @Delete
    suspend fun deleteGame(game: TableGame)
}
