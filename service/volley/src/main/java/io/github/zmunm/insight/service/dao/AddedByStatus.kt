package io.github.zmunm.insight.service.dao

internal data class AddedByStatus(
    val beaten: Int?,
    val dropped: Int?,
    val owned: Int?,
    val playing: Int?,
    val toplay: Int?,
    val yet: Int?
)
