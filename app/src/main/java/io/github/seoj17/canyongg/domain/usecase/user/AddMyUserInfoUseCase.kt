package io.github.seoj17.canyongg.domain.usecase.user

import dagger.Reusable
import io.github.seoj17.canyongg.data.local.user.MyUserInfoEntity
import io.github.seoj17.canyongg.data.repository.MyUserRepository
import io.github.seoj17.canyongg.domain.model.MyUserInfoDomainModel
import javax.inject.Inject

@Reusable
class AddMyUserInfoUseCase @Inject constructor(
    private val repository: MyUserRepository,
) {
    suspend operator fun invoke(domain: MyUserInfoDomainModel) {
        repository.addMyUserInfo(
            MyUserInfoEntity(
                puuid = domain.puuid,
                profile = domain.profile,
                level = domain.level,
                name = domain.name,
                tier = domain.tier,
                wholeMatch = domain.wholeMatch,
                win = domain.win,
                lose = domain.lose,
                winRate = domain.winRate,
                kda = domain.kda,
            )
        )
    }
}