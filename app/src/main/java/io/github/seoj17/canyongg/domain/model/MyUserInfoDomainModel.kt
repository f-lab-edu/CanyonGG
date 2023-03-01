package io.github.seoj17.canyongg.domain.model

import io.github.seoj17.canyongg.data.local.user.MyUserInfoEntity

data class MyUserInfoDomainModel(
    val puuid: String,
    val profile: Int,
    val level: Int,
    val name: String,
    val tier: String,
    val wholeMatch: Int,
    val win: Int,
    val lose: Int,
    val winRate: Int,
    val kda: Double,
) {
    companion object {
        operator fun invoke(entity: MyUserInfoEntity): MyUserInfoDomainModel {
            return MyUserInfoDomainModel(
                puuid = entity.puuid,
                profile = entity.profile,
                level = entity.level,
                name = entity.name,
                tier = entity.tier,
                wholeMatch = entity.wholeMatch,
                win = entity.win,
                lose = entity.lose,
                winRate = entity.winRate,
                kda = entity.kda,
            )
        }
    }
}