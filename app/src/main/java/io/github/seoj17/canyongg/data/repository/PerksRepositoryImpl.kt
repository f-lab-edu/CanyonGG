package io.github.seoj17.canyongg.data.repository

import io.github.seoj17.canyongg.data.local.perks.PerksDao
import io.github.seoj17.canyongg.data.local.perks.PerksEntity
import io.github.seoj17.canyongg.data.model.PerkDataModel
import io.github.seoj17.canyongg.data.remote.DataCenterService
import javax.inject.Inject

class PerksRepositoryImpl @Inject constructor(
    private val dataCenterService: DataCenterService,
    private val perksDao: PerksDao,
) : PerksRepository {
    override suspend fun getPerk(id: Int): PerksEntity {
        return perksDao.getPerk(id)
    }

    override suspend fun getPerksList(): List<PerkDataModel> {
        val list = mutableListOf<PerkDataModel>()
        dataCenterService.getPerks().forEach {
            list.add(PerkDataModel(it))
            it.slots.forEach { slot ->
                list.addAll(PerkDataModel(slot.runes))
            }
        }
        return list.toList()
    }

    override suspend fun addPerksList(entity: List<PerksEntity>) {
        perksDao.insert(entity)
    }

    override suspend fun addPerk(entity: PerksEntity) {
        perksDao.insert(entity)
    }
}