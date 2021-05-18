package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.remote.GameServiceSpec
import io.github.zmunm.insight.remote.RetrofitInstance
import io.github.zmunm.insight.remote.api.GameApi

class GameServiceImplSpec : GameServiceSpec({ url ->
    GameServiceImpl(
        RetrofitInstance(
            url, "KEY"
        ).create(GameApi::class.java),
    )
})
