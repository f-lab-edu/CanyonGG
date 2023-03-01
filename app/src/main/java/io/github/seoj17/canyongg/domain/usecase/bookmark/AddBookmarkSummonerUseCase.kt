package io.github.seoj17.canyongg.domain.usecase.bookmark

import dagger.Reusable
import io.github.seoj17.canyongg.data.local.bookmark.SummonerBookmarkEntity
import io.github.seoj17.canyongg.data.repository.SummonerBookmarkRepository
import io.github.seoj17.canyongg.domain.model.BookmarkSummonerDomainModel
import javax.inject.Inject

@Reusable
class AddBookmarkSummonerUseCase @Inject constructor(
    private val repository: SummonerBookmarkRepository,
) {
    suspend operator fun invoke(domain: BookmarkSummonerDomainModel) {
        repository.addBookmarkSummoner(
            SummonerBookmarkEntity(
                puuid = domain.puuid,
                summonerName = domain.summonerName,
                summonerLevel = domain.summonerLevel,
                summonerIcon = domain.summonerIcon,
            )
        )
    }
}