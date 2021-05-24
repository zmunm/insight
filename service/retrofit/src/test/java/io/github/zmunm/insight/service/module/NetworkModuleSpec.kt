package io.github.zmunm.insight.service.module

import io.kotest.core.spec.style.FunSpec

class NetworkModuleSpec : FunSpec({
    test("provideGameService") {
        NetworkModule.provideGameService("key")
    }
})
