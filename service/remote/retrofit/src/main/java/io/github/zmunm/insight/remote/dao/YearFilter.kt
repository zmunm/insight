package io.github.zmunm.insight.remote.dao

data class YearFilter(
    val count: Int,
    val decade: Int,
    val filter: String,
    val from: Int,
    val nofollow: Boolean,
    val to: Int,
    val years: List<Year>
)