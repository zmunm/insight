package io.github.zmunm.insight

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import androidx.paging.cachedIn
import com.orhanobut.logger.Logger
import io.github.zmunm.insight.entity.Movie
import io.github.zmunm.insight.usecase.GetTodayMovies

class TodayViewModel @ViewModelInject constructor(
    private val getTodayMovies: GetTodayMovies,
    @Assisted private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    fun getPager() = Pager(
        config = PagingConfig(enablePlaceholders = true, pageSize = 100),
        pagingSourceFactory = {
            object : PagingSource<Int, Movie>() {

                override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
                    val page = params.key ?: 1
                    return try {
                        val response = getTodayMovies(page)
                        LoadResult.Page(
                            data = response,
                            prevKey = if (page == 1) null else page - 1,
                            nextKey = if (response.isEmpty()) null else page + 1
                        )
                    } catch (exception: Exception) {
                        Logger.e(exception, "123")
                        LoadResult.Error(exception)
                    }
                }
            }
        }
    ).flow
        .cachedIn(viewModelScope)
}
