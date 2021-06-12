package io.github.zmunm.insight.cache.converter

internal val dateConverter = DateDelightConverter()

internal class DateDelightConverterSpec : DateConverterSpec(
    { it?.let(dateConverter::decode) },
    { it?.let(dateConverter::encode) },
)
