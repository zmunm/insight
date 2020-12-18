package io.github.zmunm.insight.initializer

import android.content.Context
import androidx.startup.Initializer
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import io.github.zmunm.insight.BuildConfig

class LoggerInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)
            .methodCount(0)
            .tag("Insight")
            .build()
        Logger.addLogAdapter(
            object : AndroidLogAdapter(formatStrategy) {
                override fun isLoggable(priority: Int, tag: String?) = BuildConfig.DEBUG
            }
        )
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
