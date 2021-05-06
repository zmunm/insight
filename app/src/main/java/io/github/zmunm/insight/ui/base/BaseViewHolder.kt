package io.github.zmunm.insight.ui.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import io.github.zmunm.insight.getActivity

abstract class BaseViewHolder(
    binding: ViewDataBinding,
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.lifecycleOwner = itemView.getActivity() as BaseActivity<*>
    }
}
