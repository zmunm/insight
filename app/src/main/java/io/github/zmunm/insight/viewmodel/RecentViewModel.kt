package io.github.zmunm.insight.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.base.BaseViewModel
import io.github.zmunm.insight.usecase.GetRecentGames
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@HiltViewModel
class RecentViewModel @Inject constructor(
    getRecentGames: GetRecentGames,
) : BaseViewModel() {
    val recentGames: Flow<List<Game>> = getRecentGames().flowOn(Dispatchers.IO)
}
