package io.github.zmunm.insight.remote

import io.github.zmunm.insight.repository.service.GameService
import io.kotest.core.spec.style.DescribeSpec
import okhttp3.mockwebserver.MockWebServer

private const val CODE_UNAUTHORIZED = 401

abstract class GameServiceSpec(
    serviceProvider: (url: String) -> GameService,
) : DescribeSpec({
    val server = MockWebServer()

    val gameService by lazy {
        serviceProvider(server.url("/api/").toString())
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
            server.enqueue(errorResponse.toMockResponse(CODE_UNAUTHORIZED))
            gameService.fetchGames(null)
        }
    }

    describe("fetchGameDetail") {
        it("id 1") {
            server.enqueue(gameDetailResponse.toMockResponse())
            gameService.fetchGameDetail(1)
        }

        it("error") {
            server.enqueue(errorResponse.toMockResponse(CODE_UNAUTHORIZED))
            gameService.fetchGameDetail(1)
        }
    }

    afterSpec {
        server.shutdown()
    }
})
