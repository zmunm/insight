package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class ResponseError(
    val error: String,
)
