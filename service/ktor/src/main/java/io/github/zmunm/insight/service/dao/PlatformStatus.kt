package io.github.zmunm.insight.service.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class PlatformStatus(
    val platform: Platform,
    val released_at: String?,
)
