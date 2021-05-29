package io.github.zmunm.insight.service.impl

import io.github.zmunm.insight.service.GameServiceSpec
import io.github.zmunm.insight.service.RetrofitInstance
import io.github.zmunm.insight.service.api.GameRetrofitApi

class GameRetrofitServiceSpec : GameServiceSpec({ url ->
    GameRetrofitService(
        RetrofitInstance(
            url, "KEY"
        ).create(GameRetrofitApi::class.java),
    )
})
