package io.github.zmunm.insight.ui.adapter.viewholder

import android.content.Intent
import io.github.zmunm.insight.Params
import io.github.zmunm.insight.databinding.ListGameBinding
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.base.BaseViewHolder
import io.github.zmunm.insight.ui.detail.SingleDetailActivity

class GameViewHolder(
    private val binding: ListGameBinding,
) : BaseViewHolder(binding) {
    init {
        binding.setClickListener { view ->
            binding.game?.let { game ->
                view.context.startActivity(
                    Intent(view.context, SingleDetailActivity::class.java)
                        .putExtra(Params.GAME_ID, game.id)
                )
            }
        }
    }

    fun bind(item: Game) {
        binding.game = item
    }
}
