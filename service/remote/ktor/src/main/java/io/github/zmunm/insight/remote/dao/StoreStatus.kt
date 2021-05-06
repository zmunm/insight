package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class StoreStatus(
    val id: Int,
    val store: Store,
    val url: String? = null,
)
