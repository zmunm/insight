package io.github.zmunm.insight.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.orhanobut.logger.Logger
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.TodayViewModel
import io.github.zmunm.insight.databinding.FragmentTodayBinding
import io.github.zmunm.insight.ui.adapter.TodayAdapter
import io.github.zmunm.insight.ui.base.BaseFragment

@AndroidEntryPoint
class TodayFragment : BaseFragment<FragmentTodayBinding>() {

    private val viewModel: TodayViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.fragment_today

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TodayAdapter()
        binding.list.adapter = adapter

        viewModel.movies.observe(viewLifecycleOwner) {
            adapter.submitList(it)
            Logger.i(it.toString())
        }
    }
}
