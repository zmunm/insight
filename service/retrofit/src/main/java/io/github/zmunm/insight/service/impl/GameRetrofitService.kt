package io.github.zmunm.insight.service.impl

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import io.github.zmunm.insight.entity.Game
import io.github.zmunm.insight.repository.KnownThrowable
import io.github.zmunm.insight.repository.service.GameService
import io.github.zmunm.insight.service.api.GameRetrofitApi
import io.github.zmunm.insight.service.dao.ResponseError
import io.github.zmunm.insight.service.dao.ResponseGame
import io.github.zmunm.insight.service.dao.ResponseGameDetail
import retrofit2.HttpException
import retrofit2.Response

internal class GameRetrofitService(
    private val gameApi: GameRetrofitApi,
) : GameService {

    private val errorConverter = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
        .adapter(ResponseError::class.java)

    override suspend fun fetchGames(
        page: Int?,
    ): List<Game> = gameApi.fetchGames(page).run {
        body()?.results?.map { responseGame ->
            responseGame.toEntity()
        } ?: emptyList()
    }

    override suspend fun fetchGameDetail(
        id: Long,
    ): Result<Game> = gameApi.fetchGameDetail(id).toResult { it.toEntity() }

    private fun ResponseGame.toEntity(): Game = Game(
        id = id,
        name = name,
        backgroundImage = background_image,
    )

    private fun ResponseGameDetail.toEntity(): Game = Game(
        id = id,
        name = name,
        backgroundImage = background_image,
    )

    private fun <T, R> Response<T>.toResult(mapper: (T) -> R): Result<R> =
        if (isSuccessful) {
            body()?.let {
                Result.success(mapper(it))
            } ?: Result.failure(NullPointerException(headers().toString()))
        } else {
            Result.failure(
                errorBody()?.source()
                    ?.let(errorConverter::fromJson)
                    ?.let {
                        KnownThrowable(
                            it.error,
                            HttpException(this)
                        )
                    } ?: HttpException(this)
            )
        }
}
