package io.github.zmunm.insight.cache.dao

import io.github.zmunm.insight.cache.table.TableGame
import io.github.zmunm.insight.cache.table.TableLike
import io.realm.kotlin.delete
import io.realm.kotlin.toFlow
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.withContext
import java.util.Date

internal class GameRealmDao : BaseRealmDao {
    fun getGames(): Flow<List<TableGame>> = instantRealm { realm ->
        realm.where(TableGame::class.java)
            .findAll()
            .toFlow()
            .mapNotNull {
                realm.copyFromRealm(it)
            }
    }.flowOn(Dispatchers.Main)

    fun getGame(id: Long): Flow<TableGame> = instantRealmTransaction { realm ->
        val findItem = realm.where(TableGame::class.java)
            .equalTo("id", id)
            .findFirst()
        (findItem ?: realm.copyToRealmOrUpdate(TableGame(id = id)))
            .toFlow()
            .mapNotNull {
                if (it?.isValid == true && !it.backgroundImage.isNullOrBlank()) {
                    realm.copyFromRealm(it)
                } else {
                    null
                }
            }
    }.flowOn(Dispatchers.Main)
        .distinctUntilChanged()

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
        instantRealmTransaction { realm ->
            game.like = realm.where(TableGame::class.java)
                .equalTo("id", game.id)
                .findFirst()
                ?.like
            realm.insertOrUpdate(game)
        }
    }

    fun insertAll(games: List<TableGame>) {
        asyncRealm {
            it.insertOrUpdate(games)
        }
    }

    fun deleteAll() {
        asyncRealm {
            it.delete<TableGame>()
        }
    }

    fun getLike(id: Long): TableLike? =
        instantRealm { realm ->
            realm.where(TableLike::class.java)
                .equalTo("id", id)
                .findFirst()
                ?.let {
                    realm.copyFromRealm(it)
                }
        }

    fun getLikeFlow(id: Long): Flow<TableLike> = instantRealmTransaction { realm ->
        val findItem = realm.where(TableLike::class.java)
            .equalTo("id", id)
            .findFirst()
        (findItem ?: realm.copyToRealm(TableLike(id = id)))
            .toFlow()
            .distinctUntilChanged()
            .mapNotNull {
                if (it?.isValid == true) {
                    realm.copyFromRealm(it)
                } else {
                    null
                }
            }
    }

    fun insertLike(tableLike: TableLike) {
        instantRealmTransaction {
            it.insertOrUpdate(tableLike)
        }
    }
}
