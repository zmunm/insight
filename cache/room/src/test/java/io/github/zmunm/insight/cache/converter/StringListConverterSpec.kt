package io.github.zmunm.insight.cache.converter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe

internal class StringListConverterSpec : FunSpec({
    val converter = StringListConverter()

    test("from List<String>") {
        val raw = """["1","2"]"""
        converter.deserialize(raw) shouldContainExactly listOf("1", "2")
    }

    test("to List<String>") {
        val list = listOf("1", "2")
        converter.serialize(list) shouldBe """["1","2"]"""
    }
})
