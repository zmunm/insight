package io.github.zmunm.insight.service.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class ShortScreenshot(
    val id: Int,
    val image: String
)
