package io.github.zmunm.insight.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.switchMap
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.usecase.GetLike
import io.github.zmunm.insight.usecase.ToggleLike
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

class GameViewModel @Inject constructor(
    getLike: GetLike,
    private val toggleLike: ToggleLike,
    private val dispatcher: CoroutineDispatcher,
) {
    private val _game = MutableLiveData<Game>()
    val game: LiveData<Game> get() = _game

    val like: LiveData<Boolean> = _game.switchMap { book ->
        getLike(book.id).map { it.like }.asLiveData()
    }

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
