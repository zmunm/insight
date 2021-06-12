package io.github.zmunm.insight.service

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
        it("page 1") {
            server.enqueue(gameListResponse1.toMockResponse())
            gameService.fetchGames(null)
        }

        it("page 2") {
            server.enqueue(gameListResponse2.toMockResponse())
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
