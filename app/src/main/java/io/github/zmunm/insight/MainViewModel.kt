package io.github.zmunm.insight

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.orhanobut.logger.Logger
import io.github.zmunm.insight.entity.Movie
import io.github.zmunm.insight.usecase.GetMovies
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val getMovies: GetMovies,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val page: MutableStateFlow<Int> = MutableStateFlow(0)

    val movies: LiveData<List<Movie>> = page.flatMapLatest { page ->
        getMovies(page)
    }.asLiveData()

    init {
        viewModelScope.launch {
            page.collect { nextPage ->
                Logger.i(nextPage.toString())
            }
        }
    }

    fun next(next: Int) {
        page.value = next
    }

    fun reset() {
        page.value = 0
    }
}
