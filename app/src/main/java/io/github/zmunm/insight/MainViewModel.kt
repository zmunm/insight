package io.github.zmunm.insight

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.orhanobut.logger.Logger
import io.github.zmunm.insight.usecase.GetMovies
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val getMovies: GetMovies,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val page: MutableLiveData<Int> = MutableLiveData()

    init {
        viewModelScope.launch {
            getMovies().collect {
                Logger.i(it.toString())
            }
        }
    }

    fun next(nextPage: Int) = page.postValue(nextPage)
}