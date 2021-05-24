package io.github.zmunm.insight.service.dao

internal data class MetacriticPlatformStatus(
    val metascore: Int,
    val platform: MetacriticPlatform,
    val url: String
)
