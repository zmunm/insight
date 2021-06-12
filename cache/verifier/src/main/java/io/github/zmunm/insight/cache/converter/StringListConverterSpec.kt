package io.github.zmunm.insight.cache.converter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe

abstract class StringListConverterSpec(
    toList: (String) -> List<String>,
    fromList: (List<String>) -> String,
) : FunSpec({
    test("to List<String>") {
        val raw = """["1","2"]"""
        toList(raw) shouldContainExactly listOf("1", "2")
    }

    test("from List<String>") {
        val list = listOf("1", "2")
        fromList(list) shouldBe """["1","2"]"""
    }
})
