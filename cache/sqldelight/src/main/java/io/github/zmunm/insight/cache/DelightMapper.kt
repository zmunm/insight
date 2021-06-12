package io.github.zmunm.insight.cache

import io.github.zmunm.insight.TableGame
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like
import java.util.Date

internal val gameMapper: (
    id: Long,
    name: String,
    backgroundImage: String?,
    addedAt: Date,
) -> Game = { id, name, backgroundImage, _ ->
    Game(
        id = id,
        name = name,
        backgroundImage = backgroundImage,
    )
}

internal val likeMapper: (
    id: Long,
    like: Boolean,
) -> Like = { id, like ->
    Like(
        id = id,
        like = like,
    )
}

internal fun Game.toTable(): TableGame = TableGame(
    id = id,
    name = name,
    backgroundImage = backgroundImage,
    addedAt = Date()
)
