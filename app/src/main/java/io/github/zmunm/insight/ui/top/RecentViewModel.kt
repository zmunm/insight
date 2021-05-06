package io.github.zmunm.insight.ui.top

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.base.BaseViewModel
import io.github.zmunm.insight.usecase.GetRecentGames
import javax.inject.Inject

@HiltViewModel
class RecentViewModel @Inject constructor(
    getRecentGames: GetRecentGames,
) : BaseViewModel() {
    val recentGames: LiveData<List<Game>> = getRecentGames().asLiveData()
}
