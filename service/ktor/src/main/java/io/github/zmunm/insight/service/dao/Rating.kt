package io.github.zmunm.insight.service.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class Rating(
    val count: Int,
    val id: Int,
    val percent: Double,
    val title: String
)
