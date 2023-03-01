package io.github.seoj17.canyongg.data.repository

import io.github.seoj17.canyongg.data.local.recent.search.RecentSearchNameEntity
import io.github.seoj17.canyongg.data.model.SummonerDataModel
import io.github.seoj17.canyongg.data.model.SummonerTierDataModel
import kotlinx.coroutines.flow.Flow

interface SummonerRepository {
    suspend fun getSummonerInfo(userName: String): SummonerDataModel?
    suspend fun getTier(id: String): SummonerTierDataModel?
    fun getRecentSummoner(): Flow<List<RecentSearchNameEntity>>
    suspend fun getRotationChamps(): List<Int>
    suspend fun addRecentSummoner(puuid: String, name: String)
    suspend fun deleteRecentSummoner(name: String)
    suspend fun deleteAllRecentSummoners()
}