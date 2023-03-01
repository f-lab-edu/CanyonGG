package io.github.seoj17.canyongg.domain.model

import io.github.seoj17.canyongg.data.local.bookmark.SummonerBookmarkEntity

data class BookmarkSummonerDomainModel(
    val puuid: String,
    val summonerName: String,
    val summonerLevel: Int,
    val summonerIcon: Int,
) {
    companion object {
        operator fun invoke(entity: SummonerBookmarkEntity): BookmarkSummonerDomainModel {
            return BookmarkSummonerDomainModel(
                puuid = entity.puuid,
                summonerName = entity.summonerName,
                summonerLevel = entity.summonerLevel,
                summonerIcon = entity.summonerIcon,
            )
        }

        operator fun invoke(entity: List<SummonerBookmarkEntity>): List<BookmarkSummonerDomainModel> {
            return entity.map {
                invoke(it)
            }
        }
    }
}