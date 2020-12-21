package io.github.zmunm.insight.repository.service

import io.github.zmunm.insight.entity.Movie
import kotlinx.coroutines.flow.Flow

interface MovieCache {
    suspend fun getMovies(): Flow<List<Movie>>

    suspend fun getMovie(id: Int): Flow<Movie>

    suspend fun insertAll(movies: List<Movie>)
}
