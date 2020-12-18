package io.github.zmunm.insight.repository

import io.github.zmunm.insight.entity.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getMovies(page: Int?): Flow<List<Movie>>
}