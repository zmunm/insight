package io.github.zmunm.insight

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.ContextWrapper
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf

fun Map<String, Any?>.toBundle(): Bundle = bundleOf(*toList().toTypedArray())

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
