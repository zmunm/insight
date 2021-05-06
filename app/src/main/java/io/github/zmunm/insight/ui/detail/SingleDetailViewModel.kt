package io.github.zmunm.insight.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.Params
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.usecase.GetGameDetail
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SingleDetailViewModel @Inject constructor(
    getGameDetail: GetGameDetail,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {
    val gameDetail: LiveData<Game> =
        getGameDetail(
            savedStateHandle.get<Int>(Params.GAME_ID) ?: error(Params.GAME_ID)
        ).asLiveData()

    init {
        val id = savedStateHandle.get<Int>(Params.GAME_ID)
        Timber.i(id.toString())
    }
}
