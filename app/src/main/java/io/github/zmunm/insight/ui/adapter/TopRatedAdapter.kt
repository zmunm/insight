package io.github.zmunm.insight.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.github.zmunm.insight.Params
import io.github.zmunm.insight.databinding.ListGameBinding
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.base.BaseViewHolder
import io.github.zmunm.insight.ui.detail.SingleDetailActivity

class TopRatedAdapter : PagingDataAdapter<Game, RecyclerView.ViewHolder>(GameDiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerView.ViewHolder =
        GameViewHolder(
            ListGameBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        getItem(position)?.let {
            (holder as GameViewHolder).bind(it)
        }
    }

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
}

private class GameDiffCallback : DiffUtil.ItemCallback<Game>() {

    override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem == newItem
    }
}
