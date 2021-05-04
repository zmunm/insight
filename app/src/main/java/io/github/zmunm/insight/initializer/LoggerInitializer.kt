package io.github.zmunm.insight.initializer

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.startup.Initializer
import io.github.zmunm.insight.BuildConfig
import io.github.zmunm.insight.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

internal class LoggerInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.tag(context.getString(R.string.app_name))
            Timber.plant(Timber.DebugTree())
        }
        Timber.plant(
            object : Timber.Tree() {
                override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                    when (priority) {
                        Log.INFO -> CoroutineScope(Dispatchers.Main).launch {
                            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        )
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
