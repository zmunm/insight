package io.github.zmunm.insight.repository

import io.github.zmunm.insight.entity.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getTodayMovies(page: Int?): List<Movie>

    suspend fun getRecentMovies(): Flow<List<Movie>>

    suspend fun getMovie(id: Int): Flow<Movie>

    suspend fun insertAll(movies: List<Movie>)
}
