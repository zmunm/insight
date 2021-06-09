package io.github.zmunm.insight.ui.adapter.paging

import androidx.paging.PagingSource
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.usecase.GetGames
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.clearMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.mockk
import io.mockk.slot

class GamePagingSourceSpec : DescribeSpec({
    val getGames: GetGames = mockk()

    val source = GamePagingSource(getGames)

    describe("paging") {
        var books: List<Game> = emptyList()
        val pageSlot = slot<Int>()

        coEvery {
            getGames(
                page = capture(pageSlot),
            )
        } answers {
            books
        }

        it("start") {
            books = listOf(mockk())
            source.load(
                PagingSource.LoadParams.Refresh(
                    key = null,
                    loadSize = 2,
                    placeholdersEnabled = false
                )
            ) shouldBe PagingSource.LoadResult.Page(
                data = books,
                prevKey = null,
                nextKey = 2
            )
            pageSlot.captured shouldBe 1
            source.getPager()
        }

        it("end") {
            books = emptyList()
            source.load(
                PagingSource.LoadParams.Refresh(
                    key = 10,
                    loadSize = 2,
                    placeholdersEnabled = false
                )
            ) shouldBe PagingSource.LoadResult.Page(
                data = books,
                prevKey = 9,
                nextKey = null
            )
            pageSlot.captured shouldBe 10
            source.getPager()
        }

        it("page 5") {
            books = listOf(mockk())
            source.load(
                PagingSource.LoadParams.Refresh(
                    key = 5,
                    loadSize = 2,
                    placeholdersEnabled = false
                )
            ) shouldBe PagingSource.LoadResult.Page(
                data = books,
                prevKey = 4,
                nextKey = 6
            )
            pageSlot.captured shouldBe 5
            source.getPager()
        }

        coVerify {
            getGames(
                page = capture(pageSlot),
            )
        }
    }

    afterContainer {
        confirmVerified(getGames)
        clearMocks(getGames)
    }
})
