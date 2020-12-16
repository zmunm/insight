package io.github.zmunm.insight.repository.impl

import io.github.zmunm.insight.entity.Movie
import io.github.zmunm.insight.repository.MovieRepository

class MovieRepositoryImpl : MovieRepository {
    override fun getMovies(): List<Movie> = listOf(
        Movie(
            "name1"
        )
    )
}