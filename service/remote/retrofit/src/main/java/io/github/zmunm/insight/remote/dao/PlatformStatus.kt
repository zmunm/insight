package io.github.zmunm.insight.remote.dao

data class PlatformStatus(
    val platform: Platform,
    val released_at: String,
    val requirements_en: Any?,
    val requirements_ru: Any?
)