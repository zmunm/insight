package io.github.zmunm.insight.cache.impl

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.runtime.coroutines.asFlow
import io.github.zmunm.insight.DelightDatabase
import io.github.zmunm.insight.TableGame
import io.github.zmunm.insight.cache.converter.DateConverter
import io.github.zmunm.insight.entity.Game
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
            addedAtAdapter = DateConverter()
        )
    ).tableGameQueries

    private val entityMapper: (
        id: Long,
        name: String,
        backgroundImage: String,
        addedAt: Date,
    ) -> Game = { id, name, backgroundImage, _ ->
        Game(
            id = id,
            name = name,
            backgroundImage = backgroundImage,
        )
    }

    override fun getGames(): Flow<List<Game>> =
        tableGameQueries.selectAll(entityMapper)
            .asFlow()
            .map { it.executeAsList() }

    override fun getGame(id: Long): Flow<Game> =
        tableGameQueries.selectGame(id, entityMapper)
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

    private fun Game.toTable(): TableGame = TableGame(
        id = id,
        name = name,
        backgroundImage = backgroundImage,
        addedAt = Date()
    )
}
