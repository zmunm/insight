package io.github.zmunm.insight.ui.top

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.FragmentTopRatedBinding
import io.github.zmunm.insight.ui.adapter.TopRatedAdapter
import io.github.zmunm.insight.ui.base.BaseFragment
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TopRatedFragment : BaseFragment<FragmentTopRatedBinding>() {

    private val viewModel: TopRatedViewModel by viewModels()

    private var pageJob: Job? = null

    override val layoutId: Int
        get() = R.layout.fragment_top_rated

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TopRatedAdapter()
        binding.list.adapter = adapter

        pageJob?.cancel()
        pageJob = lifecycleScope.launch {
            viewModel.getPager().collectLatest {
                adapter.submitData(it)
            }
        }
    }
}
