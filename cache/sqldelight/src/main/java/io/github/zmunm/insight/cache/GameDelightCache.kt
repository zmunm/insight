package io.github.zmunm.insight.cache

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.runtime.coroutines.asFlow
import io.github.zmunm.insight.DelightDatabase
import io.github.zmunm.insight.TableGame
import io.github.zmunm.insight.cache.converter.DateDelightConverter
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import io.github.zmunm.insight.repository.cache.GameCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapNotNull
import java.util.Date

internal class GameDelightCache(
    driver: SqlDriver,
) : GameCache {
    private val tableGameQueries = DelightDatabase(
        driver,
        tableGameAdapter = TableGame.Adapter(
            addedAtAdapter = DateDelightConverter()
        )
    ).tableGameQueries

    override fun getGames(): Flow<List<Game>> =
        tableGameQueries.selectAll(gameMapper)
            .asFlow()
            .map { it.executeAsList() }

    override fun getGame(id: Long): Flow<Game> =
        tableGameQueries.selectGame(id, gameMapper)
            .asFlow()
            .mapNotNull { it.executeAsOneOrNull() }

    override suspend fun putGame(game: Game) {
        tableGameQueries.insertFullGame(game.toTable())
    }

    override suspend fun hasGame(
        id: Long,
        timeout: Long,
    ): Boolean = tableGameQueries.hasGame(id, Date(), timeout).executeAsOne()

    override suspend fun insertAll(games: List<Game>) {
        games.forEach {
            tableGameQueries.insertFullGame(it.toTable())
        }
    }

    override suspend fun deleteAll() {
        tableGameQueries.deleteAllGame()
    }

    override suspend fun getLike(id: Long): Like? =
        tableGameQueries.selectLike(id, likeMapper)
            .executeAsOneOrNull()

    override fun getLikeFlow(id: Long): Flow<Like> =
        tableGameQueries.selectLike(id, likeMapper)
            .asFlow()
            .mapNotNull { it.executeAsOneOrNull() }

    override suspend fun insertLike(like: Like) {
        tableGameQueries.insertLike(
            id = like.id,
            like = like.like
        )
    }
}
