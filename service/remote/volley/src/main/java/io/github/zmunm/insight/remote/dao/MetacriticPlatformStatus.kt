package io.github.zmunm.insight.remote.dao

internal data class MetacriticPlatformStatus(
    val metascore: Int,
    val platform: MetacriticPlatform,
    val url: String
)
