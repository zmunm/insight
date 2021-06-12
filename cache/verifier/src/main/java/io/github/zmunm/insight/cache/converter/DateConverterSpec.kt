package io.github.zmunm.insight.cache.converter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import java.util.Date

abstract class DateConverterSpec(
    toDate: (Long) -> Date,
    fromDate: (Date) -> Long,
) : FunSpec({

    test("from date") {
        val date = Date()
        val timeStamp = fromDate(date)
        timeStamp shouldNotBe null
        toDate(timeStamp).time shouldBe date.time
    }

    test("to date") {
        val timeStamp = 1_000L
        val date = toDate(timeStamp)
        date shouldNotBe null
        fromDate(date) shouldBe timeStamp
    }
})
