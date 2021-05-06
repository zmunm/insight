package io.github.zmunm.insight.ui.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import io.github.zmunm.insight.entity.Game

class GameDiff : DiffUtil.ItemCallback<Game>() {

    override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem == newItem
    }
}
