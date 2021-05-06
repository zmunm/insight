package io.github.zmunm.insight.ui.top

import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import androidx.paging.PagingState
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.base.BaseViewModel
import io.github.zmunm.insight.usecase.GetGames
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class TopRatedViewModel @Inject constructor(
    private val getGames: GetGames,
) : BaseViewModel() {
    fun getPager() = Pager(
        config = PagingConfig(enablePlaceholders = true, pageSize = 20),
        pagingSourceFactory = {
            object : PagingSource<Int, Game>() {

                override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Game> {
                    val page = params.key ?: 1
                    return try {
                        val response = getGames(page)
                        LoadResult.Page(
                            data = response,
                            prevKey = if (page == 1) null else page - 1,
                            nextKey = if (response.isEmpty()) null else page + 1
                        )
                    } catch (exception: Exception) {
                        Timber.e(exception)
                        LoadResult.Error(exception)
                    }
                }

                override fun getRefreshKey(state: PagingState<Int, Game>): Int? =
                    state.anchorPosition
            }
        }
    ).flow
        .cachedIn(viewModelScope)
}
