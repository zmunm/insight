package io.github.zmunm.insight.remote.module

import io.kotest.core.spec.style.FunSpec

class NetworkModuleSpec : FunSpec({
    test("provideGameService") {
        NetworkModule.provideGameService("key")
    }
})
