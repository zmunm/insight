package io.github.zmunm.insight.repository

import io.github.zmunm.insight.entity.Movie

interface MovieRepository {
    fun getMovies(): List<Movie>
}