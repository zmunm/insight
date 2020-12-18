package io.github.zmunm.insight.repository.datasource

import io.github.zmunm.insight.entity.Movie
import io.github.zmunm.insight.repository.MovieRepository
import io.github.zmunm.insight.repository.service.MovieService
import kotlinx.coroutines.flow.Flow

internal class MovieDataSource(
    private val movieService: MovieService
) : MovieRepository {
    override suspend fun getMovies(page: Int?): Flow<List<Movie>> = movieService.fetchTopRated(page)
}
