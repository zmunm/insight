package io.github.zmunm.insight.repository.service

import io.github.zmunm.insight.entity.Movie
import kotlinx.coroutines.flow.Flow

interface MovieService {
    suspend fun fetchTopRated(
        page: Int?
    ): Flow<List<Movie>>
}