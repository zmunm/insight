package io.github.zmunm.insight.repository.datasource

import io.github.zmunm.insight.entity.Movie
import io.github.zmunm.insight.repository.MovieRepository
import io.github.zmunm.insight.repository.service.MovieCache
import io.github.zmunm.insight.repository.service.MovieService
import kotlinx.coroutines.flow.Flow

internal class MovieDataSource(
    private val movieService: MovieService,
    private val movieCache: MovieCache
) : MovieRepository {
    override suspend fun getTopRatedMovies(page: Int?): List<Movie> = movieService.fetchTopRated(page)

    override suspend fun getRecentMovies(): Flow<List<Movie>> = movieCache.getMovies()

    override suspend fun getMovie(id: Int): Flow<Movie> = movieCache.getMovie(id)

    override suspend fun insertAll(movies: List<Movie>) {
        movieCache.insertAll(movies)
    }
}
