package io.github.seoj17.canyongg.domain.usecase.summoner

import dagger.Reusable
import io.github.seoj17.canyongg.data.local.summoner.SummonerInfoEntity
import io.github.seoj17.canyongg.data.repository.SummonerInfoRepository
import io.github.seoj17.canyongg.domain.model.SummonerInfoDomainModel
import javax.inject.Inject

@Reusable
class AddSummonerInfoUseCase @Inject constructor(
    private val summonerInfoRepository: SummonerInfoRepository,
) {
    suspend operator fun invoke(domain: SummonerInfoDomainModel) {
        summonerInfoRepository.addSummonerInfo(
            SummonerInfoEntity(
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
                largestKill = domain.largestKill,
            )
        )
    }
}
