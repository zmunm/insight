package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.MovieRepository
import javax.inject.Inject

class GetMovies @Inject constructor(
    private val movieRepository: MovieRepository
) {
    operator fun invoke() = movieRepository.getMovies()
}