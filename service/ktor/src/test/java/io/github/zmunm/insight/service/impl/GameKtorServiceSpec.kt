package io.github.zmunm.insight.service.impl

import io.github.zmunm.insight.service.GameServiceSpec
import io.github.zmunm.insight.service.api.GameKtorApi

class GameKtorServiceSpec : GameServiceSpec({ url ->
    GameKtorService(
        GameKtorApi(
            url,
            "KEY"
        ),
    )
})
