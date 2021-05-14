package io.github.zmunm.insight.remote.impl

import io.github.zmunm.insight.remote.RetrofitInstance
import io.github.zmunm.insight.remote.api.GameApi
import io.kotest.core.spec.style.DescribeSpec
import okhttp3.mockwebserver.MockWebServer

class GameServiceImplSpec : DescribeSpec({
    val apiKey = "KEY"

    val server = MockWebServer()

    val gameService by lazy {
        GameServiceImpl(
            RetrofitInstance(
                server.url("/api/").toString(), apiKey
            ).create(GameApi::class.java),
        )
    }

    beforeSpec {
        server.start()
    }

    describe("fetchGames") {
        it("unknown page") {
            server.enqueue(gameListResponse.toMockResponse())
            gameService.fetchGames(null)
        }

        it("error") {
            server.enqueue(errorResponse.toMockResponse(401))
            gameService.fetchGames(null)
        }
    }

    describe("fetchGameDetail") {
        it("id 1") {
            server.enqueue(gameDetailResponse.toMockResponse())
            gameService.fetchGameDetail(1)
        }

        it("error") {
            server.enqueue(errorResponse.toMockResponse(401))
            gameService.fetchGameDetail(1)
        }
    }

    afterSpec {
        server.shutdown()
    }
})
