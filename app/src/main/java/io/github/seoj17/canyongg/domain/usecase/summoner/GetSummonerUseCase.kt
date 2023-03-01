package io.github.seoj17.canyongg.domain.usecase.summoner

import dagger.Reusable
import io.github.seoj17.canyongg.data.repository.MatchesRepository
import io.github.seoj17.canyongg.domain.model.SummonerMatchInfoDomainModel
import javax.inject.Inject

@Reusable
class GetSummonerUseCase @Inject constructor(
    private val repository: MatchesRepository,
) {
    suspend operator fun invoke(
        puuid: String,
        start: Int = 0,
    ): List<SummonerMatchInfoDomainModel> {
        val myInfoList = mutableListOf<SummonerMatchInfoDomainModel>()
        repository
            .getMatchInfo(puuid, start)
            .forEach { matchInfo ->
                matchInfo.info.participants
                    .find {
                        it.puuid == puuid
                    }
                    ?.let {
                        myInfoList.add(SummonerMatchInfoDomainModel(it))
                    }
            }
        return myInfoList
    }
}