package io.github.zmunm.insight.cache.dao

import io.github.zmunm.insight.cache.table.TableGame
import io.realm.Realm
import io.realm.kotlin.toFlow
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.withContext
import java.util.Date

internal class GameDao {
    fun getGames(): Flow<List<TableGame>> = instantRealm {
        it.where(TableGame::class.java)
            .findAll()
            .toFlow()
    }

    fun getGame(id: Long): Flow<TableGame> = instantRealmTransaction { realm ->
        val findItem = realm.where(TableGame::class.java)
            .equalTo("id", id)
            .findFirst()
        (findItem ?: realm.copyToRealm(TableGame(id = id)))
            .toFlow()
            .mapNotNull {
                if (it?.isValid == true) {
                    realm.copyFromRealm(it)
                } else {
                    null
                }
            }
    }

    suspend fun hasGame(id: Long, timeout: Long): Boolean =
        withContext(Dispatchers.IO) {
            instantRealm {
                it.where(TableGame::class.java)
                    .equalTo("id", id)
                    .greaterThan("addedAt", Date(System.currentTimeMillis() - timeout))
                    .findFirst()
            } != null
        }

    fun putGame(game: TableGame) {
        asyncRealm {
            it.insertOrUpdate(game)
        }
    }

    fun insertAll(games: List<TableGame>) {
        asyncRealm {
            it.insertOrUpdate(games)
        }
    }

    private fun <R> asyncRealm(run: (Realm) -> R) =
        Realm.getDefaultInstance().use {
            it.executeTransactionAsync { realm ->
                run(realm)
            }
        }

    private fun <R> instantRealmTransaction(run: (Realm) -> R) =
        Realm.getDefaultInstance().use { realm ->
            realm.beginTransaction()
            try {
                run(realm)
            } finally {
                realm.commitTransaction()
            }
        }

    private fun <R> instantRealm(run: (Realm) -> R) =
        Realm.getDefaultInstance().use { realm ->
            run(realm)
        }
}
