package io.github.zmunm.insight.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.github.zmunm.insight.local.table.MovieTable
import kotlinx.coroutines.flow.Flow

@Dao
internal interface MovieDao {
    @Query("SELECT * FROM movies ORDER BY title")
    fun getMovies(): Flow<List<MovieTable>>

    @Query("SELECT * FROM movies WHERE id = :id")
    fun getMovie(id: Int): Flow<MovieTable>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(plants: List<MovieTable>)
}
