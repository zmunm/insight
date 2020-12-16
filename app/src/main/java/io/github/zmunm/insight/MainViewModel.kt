package io.github.zmunm.insight

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import io.github.zmunm.insight.repository.MovieRepository

class MainViewModel @ViewModelInject constructor(
    private val movieRepository: MovieRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    init {
        movieRepository.getMovies().forEach {
            println(it)
        }
    }
}