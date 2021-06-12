package io.github.zmunm.insight.cache.converter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import java.util.Date

internal class DateConverterSpec : FunSpec({
    val converter = DateConverter()

    test("null") {
        converter.dateToTimestamp(null) shouldBe null
        converter.fromTimestamp(null) shouldBe null
    }

    test("from date") {
        val date = Date()
        val timeStamp = converter.dateToTimestamp(date)
        timeStamp shouldNotBe null
        converter.fromTimestamp(timeStamp)?.time shouldBe date.time
    }

    test("to date") {
        val timeStamp = 1_000L
        val date = converter.fromTimestamp(timeStamp)
        date shouldNotBe null
        converter.dateToTimestamp(date) shouldBe timeStamp
    }
})
