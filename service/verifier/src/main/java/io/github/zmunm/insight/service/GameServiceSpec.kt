package io.github.zmunm.insight.service

import io.github.zmunm.insight.repository.service.GameService
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.test.TestContext
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
        it("gameListResponse1") {
            server.enqueue(getResponseFromResource().toMockResponse())
            gameService.fetchGames(null)
        }

        it("gameListResponse2") {
            server.enqueue(getResponseFromResource().toMockResponse())
            gameService.fetchGames(null)
        }

        it("gameListResponse3") {
            server.enqueue(getResponseFromResource().toMockResponse())
            gameService.fetchGames(null)
        }

        it("gameListResponse4") {
            server.enqueue(getResponseFromResource().toMockResponse())
            gameService.fetchGames(null)
        }

        it("error") {
            server.enqueue(getResponseFromResource().toMockResponse(CODE_UNAUTHORIZED))
            gameService.fetchGames(null)
        }
    }

    describe("fetchGameDetail") {
        it("gameDetailResponse") {
            server.enqueue(getResponseFromResource().toMockResponse())
            gameService.fetchGameDetail(1)
        }

        it("error") {
            server.enqueue(getResponseFromResource().toMockResponse(CODE_UNAUTHORIZED))
            gameService.fetchGameDetail(1)
        }
    }

    afterSpec {
        server.shutdown()
    }
})

private fun TestContext.getResponseFromResource(): String {
    val resource = javaClass.classLoader
        ?.getResourceAsStream("${testCase.displayName}.json") ?: error(testCase.displayName)
    return resource.bufferedReader().readText()
}
