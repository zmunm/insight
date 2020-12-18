package io.github.zmunm.insight.ui.adapter

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
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.ListMovieBinding
import io.github.zmunm.insight.entity.Movie

class TodayAdapter : ListAdapter<Movie, RecyclerView.ViewHolder>(MovieDiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerView.ViewHolder =
        MovieViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.list_movie,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MovieViewHolder).bind(getItem(position))
    }

    class MovieViewHolder(
        private val binding: ListMovieBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.movie?.let { movie ->
                    navigateToDetail(movie, it)
                }
            }

            val bitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888)

            val canvas = Canvas(bitmap)

            val pnt = Paint()
            pnt.isAntiAlias = true

            val gradient1 = LinearGradient(
                0f,
                0f,
                0f,
                400f,
                Color.CYAN,
                Color.WHITE,
                Shader.TileMode.CLAMP
            )
            val gradient2 = LinearGradient(
                0f,
                0f,
                400f,
                0f,
                Color.WHITE,
                Color.MAGENTA,
                Shader.TileMode.CLAMP
            )
            val sat = LinearGradient(
                0f,
                0f,
                400f,
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
            canvas.drawRect(RectF(0f, 0f, 400f, 400f), pnt)

            binding.image.setImageBitmap(bitmap)
        }

        private fun navigateToDetail(
            movie: Movie,
            view: View,
        ) {
//            val direction =
//                MainPagerFragmentDirections.actionViewPagerFragmentToPlantDetailFragment(
//                    movie.id
//                )
//            view.findNavController().navigate(direction)
        }

        fun bind(item: Movie) {
            binding.apply {
                movie = item
                executePendingBindings()
            }
        }
    }
}

private class MovieDiffCallback : DiffUtil.ItemCallback<Movie>() {

    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem == newItem
    }
}
