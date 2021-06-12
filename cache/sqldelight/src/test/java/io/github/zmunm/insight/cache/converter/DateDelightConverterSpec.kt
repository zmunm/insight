package io.github.zmunm.insight.cache.converter

internal val dateConverter = DateDelightConverter()

internal class DateDelightConverterSpec : DateConverterSpec(
    dateConverter::decode,
    dateConverter::encode,
)
