package io.github.zmunm.insight.ui.detail

import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.FragmentSingleDetailBinding
import io.github.zmunm.insight.ui.base.BaseFragment

@AndroidEntryPoint
class SingleDetailFragment : BaseFragment<FragmentSingleDetailBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_single_detail
}
