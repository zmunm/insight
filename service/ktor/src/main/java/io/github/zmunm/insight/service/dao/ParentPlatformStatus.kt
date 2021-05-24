package io.github.zmunm.insight.service.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class ParentPlatformStatus(
    val platform: ParentPlatform
)
