package io.github.zmunm.insight.service.impl

import io.github.zmunm.insight.service.GameServiceSpec
import io.github.zmunm.insight.service.api.GameApi

class GameServiceImplSpec : GameServiceSpec({ url ->
    GameServiceImpl(
        GameApi(
            url,
            "KEY"
        ),
    )
})
