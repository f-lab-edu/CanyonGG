package io.github.seoj17.canyongg.data.repository

import io.github.seoj17.canyongg.data.local.champions.ChampionsDao
import io.github.seoj17.canyongg.data.local.champions.ChampionsEntity
import io.github.seoj17.canyongg.data.model.ChampionsDataModel
import io.github.seoj17.canyongg.data.remote.DataCenterService
import javax.inject.Inject

class ChampionsRepositoryImpl @Inject constructor(
    private val dataCenterService: DataCenterService,
    private val championsDao: ChampionsDao,
) : ChampionsRepository {
    override suspend fun getChampionList(): List<ChampionsDataModel> {
        return dataCenterService
            .getChamps()
            .data
            .toList()
            .map {
                ChampionsDataModel(
                    key = it.second.key.toInt(),
                    name = it.first
                )
            }
    }

    override suspend fun getChampion(id: Int): String {
        return championsDao.getChampion(id).name
    }

    override suspend fun addChampionList(entities: List<ChampionsEntity>) {
        championsDao.insert(entities)
    }

    override suspend fun addChampion(entity: ChampionsEntity) {
        championsDao.insert(entity)
    }
}