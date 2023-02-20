package io.github.seoj17.canyongg.domain

import dagger.Reusable
import io.github.seoj17.canyongg.data.local.MyMostChampEntity
import io.github.seoj17.canyongg.data.repository.MyUserRepository
import io.github.seoj17.canyongg.domain.model.DomainMostChamps
import javax.inject.Inject

@Reusable
class AddMyMostChampsUseCase @Inject constructor(
    private val repository: MyUserRepository
) {
    suspend operator fun invoke(domain: DomainMostChamps) {
        repository.addMostChamps(
            MyMostChampEntity(
                champName = domain.champName,
                userPuuid = domain.userPuuid,
                champKda = domain.champKda,
                champWinRate = domain.champWinRate,
            )
        )
    }
}