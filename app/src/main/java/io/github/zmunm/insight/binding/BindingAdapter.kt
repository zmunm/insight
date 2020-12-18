package io.github.zmunm.insight.binding

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("android:visibility")
fun View.bindingVisibility(isGone: Boolean) {
    visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}
