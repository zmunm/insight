package io.github.zmunm.insight.service.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class MetacriticPlatform(
    val name: String,
    val platform: Int,
    val slug: String
)
