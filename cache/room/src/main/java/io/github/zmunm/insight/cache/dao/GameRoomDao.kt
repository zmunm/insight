package io.github.zmunm.insight.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.github.zmunm.insight.cache.table.TableGame
import io.github.zmunm.insight.cache.table.TableLike
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import java.util.Date

@Dao
internal abstract class GameRoomDao : BaseDao<TableGame>() {
    @Query("SELECT * FROM games ORDER BY name")
    abstract fun getGames(): Flow<List<TableGame>>

    @Query("SELECT * FROM games WHERE id = :id")
    abstract fun getGame(id: Long): Flow<TableGame>

    @Query(
        """
        SELECT EXISTS(
            SELECT :now FROM games WHERE id = :id AND addedAt + :timeout > :now LIMIT 1
        )
        """
    )
    abstract suspend fun hasGame(id: Long, timeout: Long, now: Date = Date()): Boolean

    @Query("SELECT * FROM likes WHERE id = :id")
    abstract suspend fun getLike(id: Long): TableLike?

    @Query("SELECT * FROM likes WHERE id = :id")
    protected abstract fun getLikeAllFlow(id: Long): Flow<TableLike>

    fun getLikeFlow(id: Long): Flow<TableLike> = getLikeAllFlow(id).distinctUntilChanged()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertLike(like: TableLike)

    @Query("DELETE FROM games")
    abstract fun deleteAll()
}
