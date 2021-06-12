package io.github.zmunm.insight.cache

import io.github.zmunm.insight.cache.table.TableGame
import io.github.zmunm.insight.cache.table.TableLike
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.entity.Like

internal fun Game.toTable(): TableGame = TableGame(
    id = id,
    name = name,
    backgroundImage = backgroundImage,
)

internal fun TableGame.toEntity(): Game = Game(
    id = id,
    name = name,
    backgroundImage = backgroundImage,
)

internal fun Like.toTable(): TableLike = TableLike(
    id = id,
    like = like,
)

internal fun TableLike.toEntity(): Like = Like(
    id = id,
    like = like,
)
