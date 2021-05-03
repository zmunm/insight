package io.github.zmunm.insight.remote.dao

data class ResponseGameList(
    val count: Int,
    val description: String,
    val filters: Filters,
    val next: String?,
    val nofollow: Boolean,
    val nofollow_collections: List<String>,
    val noindex: Boolean,
    val previous: String?,
    val results: List<ResponseGame>,
    val seo_description: String,
    val seo_h1: String,
    val seo_keywords: String,
    val seo_title: String
)