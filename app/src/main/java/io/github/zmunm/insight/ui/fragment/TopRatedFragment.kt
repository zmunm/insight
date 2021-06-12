package io.github.zmunm.insight.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.FragmentTopRatedBinding
import io.github.zmunm.insight.ui.adapter.TopRatedAdapter
import io.github.zmunm.insight.ui.base.BaseFragment
import io.github.zmunm.insight.viewmodel.TopRatedViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class TopRatedFragment : BaseFragment<FragmentTopRatedBinding>() {

    @Inject
    lateinit var adapter: TopRatedAdapter

    private val viewModel: TopRatedViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.fragment_top_rated

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.list.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.pager.collectLatest {
                    adapter.submitData(it)
                }
            }
        }
    }
}
