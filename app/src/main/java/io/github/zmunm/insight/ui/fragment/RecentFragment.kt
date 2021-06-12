package io.github.zmunm.insight.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.FragmentRecentBinding
import io.github.zmunm.insight.ui.adapter.RecentAdapter
import io.github.zmunm.insight.ui.base.BaseFragment
import io.github.zmunm.insight.viewmodel.RecentViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class RecentFragment : BaseFragment<FragmentRecentBinding>() {

    @Inject
    lateinit var adapter: RecentAdapter

    private val viewModel: RecentViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.fragment_recent

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.list.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.recentGames.collectLatest {
                    adapter.submitList(it)
                }
            }
        }
    }
}
