package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.remote.GameServiceSpec
import io.github.zmunm.insight.remote.api.GameApi

class GameServiceImplSpec : GameServiceSpec({ url ->
    GameServiceImpl(
        GameApi(
            url,
            "KEY"
        ),
    )
})
