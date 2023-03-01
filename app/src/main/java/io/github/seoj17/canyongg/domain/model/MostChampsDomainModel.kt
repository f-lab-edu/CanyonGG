package io.github.seoj17.canyongg.domain.model

import io.github.seoj17.canyongg.data.local.user.MyMostChampEntity

data class MostChampsDomainModel(
    val champName: String,
    val userPuuid: String,
    val champKda: Double,
    val champWinRate: Int,
) {
    companion object {
        operator fun invoke(entity: MyMostChampEntity): MostChampsDomainModel {
            return MostChampsDomainModel(
                champName = entity.champName,
                userPuuid = entity.userPuuid,
                champKda = entity.champKda,
                champWinRate = entity.champWinRate,
            )
        }

        operator fun invoke(entities: List<MyMostChampEntity>): List<MostChampsDomainModel> {
            return entities.map {
                invoke(it)
            }
        }
    }
}