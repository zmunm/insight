package io.github.zmunm.insight.ui.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.Params
import io.github.zmunm.insight.usecase.GetGameDetail
import io.github.zmunm.insight.usecase.GetGames
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SingleDetailViewModel @Inject constructor(
    private val getGameDetail: GetGameDetail,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    init {
        val id = savedStateHandle.get<Int>(Params.GAME_ID) ?: error(Params.GAME_ID)
        Timber.i(id.toString())
        viewModelScope.launch {
            getGameDetail(id)
        }
    }
}
