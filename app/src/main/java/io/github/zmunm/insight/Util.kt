package io.github.zmunm.insight

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.ContextWrapper
import android.view.View

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
