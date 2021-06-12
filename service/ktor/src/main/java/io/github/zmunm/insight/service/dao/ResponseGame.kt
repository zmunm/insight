@file:UseSerializers(DateKtorConverter::class)

package io.github.zmunm.insight.service.dao

import io.github.zmunm.insight.service.converter.DateKtorConverter
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import java.util.Date

@Serializable
internal data class ResponseGame(
    val added: Int,
    val added_by_status: AddedByStatus,
    val background_image: String?,
    val clip: String?,
    val dominant_color: String,
    val esrb_rating: EsrbRating?,
    val genres: List<Genre>,
    val id: Long,
    val metacritic: Int?,
    val name: String,
    val parent_platforms: List<ParentPlatformStatus>,
    val platforms: List<PlatformStatus>,
    val playtime: Int,
    val rating: Double,
    val rating_top: Int,
    val ratings: List<Rating>,
    val ratings_count: Int,
    val released: Date?,
    val reviews_count: Int,
    val reviews_text_count: Int,
    val saturated_color: String,
    val short_screenshots: List<ShortScreenshot>,
    val slug: String,
    val stores: List<StoreStatus>,
    val suggestions_count: Int,
    val tags: List<Tag>,
    val tba: Boolean,
    val updated: String,
    val user_game: String?
)
