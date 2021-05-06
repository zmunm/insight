package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class MetacriticPlatformStatus(
    val metascore: Int,
    val platform: MetacriticPlatform,
    val url: String
)
