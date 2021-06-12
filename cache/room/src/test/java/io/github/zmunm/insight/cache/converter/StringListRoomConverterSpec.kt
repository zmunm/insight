package io.github.zmunm.insight.cache.converter

internal val stringListConverter = StringListRoomConverter()

internal class StringListRoomConverterSpec : StringListConverterSpec(
    stringListConverter::toList,
    stringListConverter::fromList,
)
