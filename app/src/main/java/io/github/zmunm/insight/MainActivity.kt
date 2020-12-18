package io.github.zmunm.insight

import dagger.hilt.android.AndroidEntryPoint
import io.github.zmunm.insight.databinding.ActivityMainBinding
import io.github.zmunm.insight.ui.base.BaseActivity

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId: Int
        get() = R.layout.activity_main
}
