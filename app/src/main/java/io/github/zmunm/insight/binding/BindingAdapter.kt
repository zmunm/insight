package io.github.zmunm.insight.binding

import android.view.View
import android.widget.ImageView
import androidx.annotation.ColorInt
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import io.github.zmunm.insight.util.rainbowBitmap

@BindingAdapter("android:visibility")
fun View.bindingVisibility(isVisible: Boolean) {
    visibility = if (isVisible) {
        View.VISIBLE
    } else {
        View.GONE
    }
}

@BindingAdapter("imageFromUrl")
fun ImageView.bindImageFromUrl(imageUrl: String?) {
    imageUrl ?: return
    if (imageUrl.isNotBlank()) {
        Glide.with(context)
            .load(imageUrl)
            .apply(RequestOptions().override(width, height))
            .centerCrop()
            .transition(DrawableTransitionOptions.withCrossFade())
            .error(android.R.drawable.stat_sys_warning)
            .into(this)
    } else {
        setImageBitmap(rainbowBitmap)
    }
}

@BindingAdapter("tint")
fun ImageView.setImageTintBinding(@ColorInt color: Int) {
    setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_IN)
}
