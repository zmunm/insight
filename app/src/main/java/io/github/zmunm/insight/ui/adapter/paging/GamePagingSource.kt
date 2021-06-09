package io.github.zmunm.insight.ui.adapter.paging

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.PagingSource
import androidx.paging.PagingState
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.usecase.GetGames
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GamePagingSource @Inject constructor(
    private val getGames: GetGames,
) : PagingSource<Int, Game>() {

    private val pagingConfig = PagingConfig(pageSize = PAGE_SIZE)

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Game> {
        val page = params.key ?: 1
        return getGames(
            page = page,
        ).toPage(page)
    }

    override fun getRefreshKey(state: PagingState<Int, Game>): Int? =
        state.anchorPosition

    private fun List<Game>.toPage(now: Int) = LoadResult.Page(
        data = this,
        prevKey = if (now == 1) null else now - 1,
        nextKey = if (isEmpty()) null else now + 1
    )

    fun getPager(): Flow<PagingData<Game>> = Pager(pagingConfig) { this }.flow

    companion object {
        private const val PAGE_SIZE = 20
    }
}
