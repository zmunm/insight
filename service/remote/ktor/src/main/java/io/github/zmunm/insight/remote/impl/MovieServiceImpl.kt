package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.remote.api.MovieApi
import io.github.zmunm.insight.repository.service.MovieService
import io.github.zmunm.insight.entity.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class MovieServiceImpl(
    private val movieApi: MovieApi
) : MovieService {

    override suspend fun fetchTopRated(
        page: Int?
    ): Flow<List<Movie>> = flow {
        emit(
            movieApi.fetchTopRated(page).results.map { responseMovie ->
                Movie(
                    responseMovie.title
                )
            }
        )
    }.flowOn(Dispatchers.IO)
}