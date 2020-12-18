package io.github.zmunm.insight.remote.dao

import kotlinx.serialization.Serializable

@Serializable
data class ResponseTopRated(
    val page: Int,
    val results: List<ResponseMovie>,
    val total_pages: Int,
    val total_results: Int
)