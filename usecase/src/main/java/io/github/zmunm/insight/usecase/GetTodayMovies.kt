package io.github.zmunm.insight.usecase

import io.github.zmunm.insight.repository.MovieRepository
import javax.inject.Inject

class GetTodayMovies @Inject constructor(
    private val movieRepository: MovieRepository
) {
    suspend operator fun invoke(page: Int) = movieRepository.getTodayMovies(page.takeIf { it > 0 })
}
