package io.github.zmunm.insight.ui.adapter

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ComposeShader
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.RectF
import android.graphics.Shader
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.github.zmunm.insight.Params
import io.github.zmunm.insight.databinding.ListGameBinding
import io.github.zmunm.insight.entity.Game
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
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { view ->
                binding.game?.let { game ->
                    view.context.startActivity(
                        Intent(view.context, SingleDetailActivity::class.java)
                            .putExtra(Params.GAME_ID, game.id)
                    )
                }
            }

            binding.image.setImageBitmap(bitmap)
        }

        private fun navigateToDetail(
            game: Game,
            view: View,
        ) {

        }

        fun bind(item: Game) {
            binding.apply {
                game = item
                executePendingBindings()
            }
        }

        companion object {
            val bitmap: Bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.RGB_565).apply {
                val canvas = Canvas(this)

                val pnt = Paint()
                pnt.isAntiAlias = true

                val gradient1 = LinearGradient(
                    0f,
                    0f,
                    0f,
                    200f,
                    Color.CYAN,
                    Color.WHITE,
                    Shader.TileMode.CLAMP
                )
                val gradient2 = LinearGradient(
                    0f,
                    0f,
                    200f,
                    0f,
                    Color.WHITE,
                    Color.MAGENTA,
                    Shader.TileMode.CLAMP
                )
                val sat = LinearGradient(
                    0f,
                    0f,
                    200f,
                    0f,
                    Color.YELLOW,
                    Color.WHITE,
                    Shader.TileMode.CLAMP
                )

                val merged = ComposeShader(
                    ComposeShader(gradient1, gradient2, PorterDuff.Mode.MULTIPLY),
                    sat,
                    PorterDuff.Mode.MULTIPLY
                )
                pnt.shader = merged
                canvas.drawRect(RectF(0f, 0f, 200f, 200f), pnt)
            }
        }
    }
}

private class GameDiffCallback : DiffUtil.ItemCallback<Game>() {

    override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem.id == newItem.id
    }
}
