package io.github.zmunm.insight.remote.dao

internal data class Store(
    val domain: String,
    val games_count: Int,
    val id: Int,
    val image_background: String,
    val name: String,
    val slug: String
)
