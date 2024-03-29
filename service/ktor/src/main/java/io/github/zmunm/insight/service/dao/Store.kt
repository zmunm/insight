package io.github.zmunm.insight.service.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class Store(
    val domain: String,
    val games_count: Int,
    val id: Int,
    val image_background: String,
    val name: String,
    val slug: String
)
