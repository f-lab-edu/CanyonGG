package io.github.seoj17.canyongg.domain

import dagger.Reusable
import io.github.seoj17.canyongg.data.local.ChampionsEntity
import io.github.seoj17.canyongg.data.repository.ChampionsRepository
import io.github.seoj17.canyongg.domain.model.DomainChampions
import javax.inject.Inject

@Reusable
class AddChampionUseCase @Inject constructor(
    private val repository: ChampionsRepository
) {
    suspend operator fun invoke(champion: DomainChampions) {
        repository.addChampion(
            ChampionsEntity(champion.key, champion.name)
        )
    }
}