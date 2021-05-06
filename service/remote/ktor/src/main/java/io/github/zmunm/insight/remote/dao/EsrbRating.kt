package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class EsrbRating(
    val id: Int,
    val name: String,
    val slug: String
)
