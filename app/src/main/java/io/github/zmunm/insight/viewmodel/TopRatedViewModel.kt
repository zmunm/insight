package io.github.zmunm.insight.viewmodel

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.ui.adapter.paging.GamePagingSource
import io.github.zmunm.insight.ui.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class TopRatedViewModel @Inject constructor(
    gamePagingSource: GamePagingSource,
) : BaseViewModel() {
    val pager = gamePagingSource
        .getPager()
        .cachedIn(viewModelScope)
}
