package io.github.zmunm.insight.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.Params
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.usecase.GetGameDetail
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SingleDetailViewModel @Inject constructor(
    getGameDetail: GetGameDetail,
    savedStateHandle: SavedStateHandle,
    private val gameViewModel: GameViewModel,
) : ViewModel() {
    val gameDetail: StateFlow<Game?> = gameViewModel.game
    val like: LiveData<Boolean> get() = gameViewModel.like

    private val detailFlow = getGameDetail(
        savedStateHandle.get<Long>(Params.GAME_ID) ?: error(Params.GAME_ID)
    )

    init {
        viewModelScope.launch {
            detailFlow.collectLatest {
                gameViewModel.bindBook(it)
            }
        }
    }

    fun toggleLike() {
        gameViewModel.toggleLike()
    }
}
