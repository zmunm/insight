package io.github.zmunm.insight

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.ContextWrapper
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.AppBarLayout

fun View.getActivity(): Activity = context.getActivity()

fun Context.getActivity(): Activity {
    var contextTemp = this
    while (contextTemp is ContextWrapper) {
        if (contextTemp is Activity) {
            return contextTemp
        }
        contextTemp = contextTemp.baseContext
    }
    throw ActivityNotFoundException()
}

internal fun AppBarLayout.consumeInset() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { _, _ ->
        WindowInsetsCompat.CONSUMED
    }
}
