package io.github.zmunm.insight.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.FragmentRecentBinding
import io.github.zmunm.insight.ui.adapter.RecentAdapter
import io.github.zmunm.insight.ui.base.BaseFragment
import io.github.zmunm.insight.viewmodel.RecentViewModel

@AndroidEntryPoint
class RecentFragment : BaseFragment<FragmentRecentBinding>() {

    private val viewModel: RecentViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.fragment_recent

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RecentAdapter()
        binding.list.adapter = adapter

        viewModel.recentGames.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }
}
