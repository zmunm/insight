package io.github.zmunm.insight.remote.dao

data class MetacriticPlatformStatus(
    val metascore: Int,
    val platform: MetacriticPlatform,
    val url: String
)