package io.github.zmunm.insight.cache.converter

internal val dateConverter = DateRoomConverter()

internal class DateRoomConverterSpec : DateConverterSpec(
    dateConverter::toDate,
    dateConverter::fromDate,
)
