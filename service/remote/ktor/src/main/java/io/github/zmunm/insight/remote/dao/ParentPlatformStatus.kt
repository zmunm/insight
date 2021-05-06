package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class ParentPlatformStatus(
    val platform: ParentPlatform
)
