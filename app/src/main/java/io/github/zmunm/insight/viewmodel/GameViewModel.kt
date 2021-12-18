package io.github.zmunm.insight.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.usecase.GetLike
import io.github.zmunm.insight.usecase.ToggleLike
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

class GameViewModel @Inject constructor(
    getLike: GetLike,
    private val toggleLike: ToggleLike,
    private val dispatcher: CoroutineDispatcher,
) {
    private val _game = MutableStateFlow<Game?>(null)
    val game: StateFlow<Game?> = _game.asStateFlow()

    val like: LiveData<Boolean> = _game.flatMapLatest { book ->
        if (book != null) {
            getLike(book.id).map { it.like }
        } else flowOf(false)
    }.asLiveData()

    fun bindBook(book: Game) {
        _game.value = book
    }

    fun toggleLike() {
        game.value?.let {
            CoroutineScope(dispatcher).launch {
                toggleLike(it)
            }
        }
    }
}
