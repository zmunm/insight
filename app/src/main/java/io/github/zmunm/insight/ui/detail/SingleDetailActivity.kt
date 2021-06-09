package io.github.zmunm.insight.ui.detail

import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.ActivitySingleDetailBinding
import io.github.zmunm.insight.ui.base.BaseActivity
import io.github.zmunm.insight.viewmodel.SingleDetailViewModel

@AndroidEntryPoint
class SingleDetailActivity : BaseActivity<ActivitySingleDetailBinding>() {

    private val viewModel: SingleDetailViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.activity_single_detail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
    }
}
