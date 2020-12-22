package io.github.zmunm.insight.feature.detail

import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.feature.detail.databinding.FragmentSingleDetailBinding
import io.github.zmunm.insight.ui.base.BaseFragment


@AndroidEntryPoint
class SingleDetailFragment : BaseFragment<FragmentSingleDetailBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_single_detail

}
