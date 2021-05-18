package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
internal data class AddedByStatus(
    val beaten: Int? = null,
    val dropped: Int? = null,
    val owned: Int? = null,
    val playing: Int? = null,
    val toplay: Int? = null,
    val yet: Int? = null,
)
