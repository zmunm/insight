package io.github.zmunm.insight.cache.dao

import io.realm.Realm

internal interface BaseRealmDao {
    fun <R> asyncRealm(run: (Realm) -> R) =
        Realm.getDefaultInstance().use {
            it.executeTransactionAsync { realm ->
                run(realm)
            }
        }

    fun <R> instantRealmTransaction(run: (Realm) -> R) =
        Realm.getDefaultInstance().use { realm ->
            realm.beginTransaction()
            try {
                run(realm)
            } finally {
                realm.commitTransaction()
            }
        }

    fun <R> instantRealm(run: (Realm) -> R) =
        Realm.getDefaultInstance().use { realm ->
            run(realm)
        }
}
