package io.github.zmunm.insight.initializer

import android.content.Context
import androidx.startup.Initializer
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import io.github.zmunm.insight.BuildConfig


class LoggerInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        Logger.addLogAdapter(object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?) = BuildConfig.DEBUG
        })
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
