package io.github.zmunm.insight.initializer

import android.content.Context
import androidx.startup.Initializer
import io.github.zmunm.insight.BuildConfig
import timber.log.Timber

internal class LoggerInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
