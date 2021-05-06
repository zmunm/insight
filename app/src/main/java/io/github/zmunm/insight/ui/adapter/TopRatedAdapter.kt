package io.github.zmunm.insight.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.zmunm.insight.databinding.ListGameBinding
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.adapter.diff.GameDiff
import io.github.zmunm.insight.ui.adapter.viewholder.GameViewHolder

class TopRatedAdapter : PagingDataAdapter<Game, RecyclerView.ViewHolder>(GameDiff()) {

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
}
