package io.github.seoj17.canyongg.data.repository

import androidx.paging.Pager
import io.github.seoj17.canyongg.data.local.match.MatchInfoEntity
import io.github.seoj17.canyongg.data.model.MatchesDataModel
import io.github.seoj17.canyongg.data.model.MatchInfoDataModel

interface MatchesRepository {
    fun getMatches(puuid: String): Pager<Int, MatchesDataModel>
    suspend fun getMatchId(puuid: String, startIndex: Int = 0): List<String>
    suspend fun getMatchInfo(puuid: String, startIndex: Int = 0): List<MatchInfoDataModel>
    suspend fun getMatchInfo(matchId: String): MatchInfoDataModel
    suspend fun getMyMatchInfo(puuid: String): List<MatchInfoEntity>
    suspend fun getParticipantsMatchInfo(matchId: String): List<MatchInfoEntity>
    suspend fun addMatchInfo(entity: MatchInfoEntity)
    suspend fun addMatchInfo(entities: List<MatchInfoEntity>)
}