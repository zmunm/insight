package io.github.zmunm.insight.ui

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.R
import io.github.zmunm.insight.databinding.FragmentMainPagerBinding
import io.github.zmunm.insight.ui.adapter.MainPagerAdapter
import io.github.zmunm.insight.ui.base.BaseFragment

@AndroidEntryPoint
class MainPagerFragment : BaseFragment<FragmentMainPagerBinding>() {

    override val layoutId: Int
        get() = R.layout.fragment_main_pager

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabLayout = binding.tabs
        val viewPager = binding.viewPager

        viewPager.adapter = MainPagerAdapter(this)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Top Rated"
                1 -> "Recent"
                else -> null
            }
        }.attach()
    }
}
