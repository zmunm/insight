package io.github.zmunm.insight.local.impl

import io.github.zmunm.insight.entity.Movie
import io.github.zmunm.insight.local.dao.MovieDao
import io.github.zmunm.insight.local.table.MovieTable
import io.github.zmunm.insight.repository.service.MovieCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

internal class MovieCacheImpl(
    private val movieDao: MovieDao
) : MovieCache {

    override suspend fun getMovies(): Flow<List<Movie>> = movieDao.getMovies().map { list ->
        list.map {
            Movie(
                it.id,
                it.title
            )
        }
    }

    override suspend fun getMovie(id: Int): Flow<Movie> = movieDao.getMovie(id).map {
        Movie(
            it.id,
            it.title
        )
    }

    override suspend fun insertAll(movies: List<Movie>) = movieDao.insertAll(
        movies.map {
            MovieTable(
                it.id,
                it.title
            )
        }
    )
}
