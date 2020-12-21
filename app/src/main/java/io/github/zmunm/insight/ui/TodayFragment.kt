package io.github.zmunm.insight.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.TodayViewModel
import io.github.zmunm.insight.databinding.FragmentTodayBinding
import io.github.zmunm.insight.ui.adapter.TodayAdapter
import io.github.zmunm.insight.ui.base.BaseFragment
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TodayFragment : BaseFragment<FragmentTodayBinding>() {

    private val viewModel: TodayViewModel by viewModels()

    private var pageJob: Job? = null

    override val layoutId: Int
        get() = R.layout.fragment_today

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TodayAdapter()
        binding.list.adapter = adapter

        pageJob?.cancel()
        pageJob = lifecycleScope.launch {
            viewModel.getPager().collectLatest {
                adapter.submitData(it)
            }
        }
    }
}
