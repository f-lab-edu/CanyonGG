package io.github.seoj17.canyongg.data.repository

import io.github.seoj17.canyongg.data.local.perks.PerksEntity
import io.github.seoj17.canyongg.data.model.PerkDataModel

interface PerksRepository {
    suspend fun getPerk(id: Int): PerksEntity
    suspend fun getPerksList(): List<PerkDataModel>
    suspend fun addPerksList(entity: List<PerksEntity>)
    suspend fun addPerk(entity: PerksEntity)
}