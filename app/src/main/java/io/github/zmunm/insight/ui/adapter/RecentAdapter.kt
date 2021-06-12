package io.github.zmunm.insight.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.zmunm.insight.databinding.ListGameBinding
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.ui.adapter.diff.GameDiff
import io.github.zmunm.insight.ui.adapter.viewholder.GameViewHolder
import io.github.zmunm.insight.viewmodel.GameViewModel
import javax.inject.Inject
import javax.inject.Provider

class RecentAdapter @Inject constructor(
    private val viewModelProvider: Provider<GameViewModel>,
) : ListAdapter<Game, RecyclerView.ViewHolder>(GameDiff()) {
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
        when (holder) {
            is GameViewHolder ->
                holder.bind(
                    viewModelProvider.get().apply {
                        getItem(position)?.let(::bindBook)
                    }
                )
        }
    }
}
