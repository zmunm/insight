package io.github.zmunm.insight.service.dao

internal data class PlatformStatus(
    val platform: Platform,
    val released_at: String?,
    val requirements: Map<String, String> = emptyMap(),
    val requirements_en: Any?,
    val requirements_ru: Any?
)
