package io.github.seoj17.canyongg.domain.usecase.perks

import io.github.seoj17.canyongg.data.local.perks.PerksEntity
import io.github.seoj17.canyongg.data.repository.PerksRepository
import io.github.seoj17.canyongg.domain.model.PerkDomainModel
import javax.inject.Inject

class AddPerkUseCase @Inject constructor(
    private val repository: PerksRepository,
) {
    suspend operator fun invoke(domain: PerkDomainModel) {
        repository.addPerk(
            PerksEntity(
                id = domain.id,
                name = domain.name,
                imgUrl = domain.imgUrl,
            )
        )
    }
}
