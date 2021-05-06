package io.github.zmunm.insight.ui.base

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.ContextWrapper
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(
    binding: ViewDataBinding,
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.lifecycleOwner = itemView.getActivity() as BaseActivity<*>
    }
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
}
