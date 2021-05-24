package io.github.zmunm.insight.remote.dao

internal data class ResponseList<T>(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<T>,
)
