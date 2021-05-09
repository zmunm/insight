package io.github.zmunm.insight.local

import android.content.Context
import androidx.startup.Initializer
import io.realm.Realm
import io.realm.RealmConfiguration

internal class RealmInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        Realm.init(context)
        val configuration = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()

        Realm.setDefaultConfiguration(configuration)

        Realm.getDefaultInstance()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
