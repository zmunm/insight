package io.github.zmunm.insight.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.zmunm.insight.ui.RecentFragment
import io.github.zmunm.insight.ui.top.TopRatedFragment

class MainPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val tabFragmentsCreators: List<() -> Fragment> = listOf(
        { TopRatedFragment() },
        { RecentFragment() },
    )

    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment = tabFragmentsCreators[position]()
}
