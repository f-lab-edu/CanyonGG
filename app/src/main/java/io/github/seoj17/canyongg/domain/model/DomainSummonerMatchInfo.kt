package io.github.seoj17.canyongg.domain.model

import io.github.seoj17.canyongg.data.remote.response.match.Challenges
import io.github.seoj17.canyongg.data.remote.response.match.ParticipantResponse
import io.github.seoj17.canyongg.data.remote.response.match.Perks

class DomainSummonerMatchInfo(
    val assists: Int,
    val baronKills: Int,
    val challenges: Challenges,
    val champLevel: Int,
    val championId: Int,
    val championName: String,
    val deaths: Int,
    val detectorWardsPlaced: Int,
    val gameEndedInEarlySurrender: Boolean,
    val gameEndedInSurrender: Boolean,
    val goldEarned: Int,
    val goldSpent: Int,
    val item0: Int,
    val item1: Int,
    val item2: Int,
    val item3: Int,
    val item4: Int,
    val item5: Int,
    val item6: Int,
    val kills: Int,
    val kda: Double,
    val firstSpell: String,
    val secondSpell: String,
    val mainPerk: String,
    val subPerk: String,
    val largestMultiKill: Int,
    val participantId: Int,
    val perks: Perks,
    val puuid: String,
    val sightWardsBoughtInGame: Int,
    val summonerId: String,
    val summonerLevel: Int,
    val summonerName: String,
    val teamEarlySurrendered: Boolean,
    val teamId: Int,
    val teamPosition: String,
    val timePlayed: Int,
    val totalDamageDealt: Int,
    val totalDamageDealtToChampions: Int,
    val totalDamageShieldedOnTeammates: Int,
    val totalDamageTaken: Int,
    val totalMinionsKilled: Int,
    val visionScore: Int,
    val visionWardsBoughtInGame: Int,
    val wardsKilled: Int,
    val wardsPlaced: Int,
    val win: Boolean,
) {
    companion object {
        operator fun invoke(
            response: ParticipantResponse,
            firstSpell: String,
            secondSpell: String,
            mainPerk: String,
            subPerk: String,
        ): DomainSummonerMatchInfo {
            return DomainSummonerMatchInfo(
                assists = response.assists,
                baronKills = response.baronKills,
                challenges = response.challenges,
                champLevel = response.champLevel,
                championId = response.championId,
                championName = response.championName,
                deaths = response.deaths,
                detectorWardsPlaced = response.detectorWardsPlaced,
                gameEndedInEarlySurrender = response.gameEndedInEarlySurrender,
                gameEndedInSurrender = response.gameEndedInSurrender,
                goldEarned = response.goldEarned,
                goldSpent = response.goldSpent,
                item0 = response.item0,
                item1 = response.item1,
                item2 = response.item2,
                item3 = response.item3,
                item4 = response.item4,
                item5 = response.item5,
                item6 = response.item6,
                kills = response.kills,
                kda = response.challenges.kda,
                firstSpell = firstSpell,
                secondSpell = secondSpell,
                mainPerk = mainPerk,
                subPerk = subPerk,
                largestMultiKill = response.largestMultiKill,
                participantId = response.participantId,
                perks = response.perks,
                puuid = response.puuid,
                sightWardsBoughtInGame = response.sightWardsBoughtInGame,
                summonerId = response.summonerId,
                summonerLevel = response.summonerLevel,
                summonerName = response.summonerName,
                teamEarlySurrendered = response.teamEarlySurrendered,
                teamId = response.teamId,
                teamPosition = response.teamPosition,
                timePlayed = response.timePlayed,
                totalDamageDealt = response.totalDamageDealt,
                totalDamageDealtToChampions = response.totalDamageDealtToChampions,
                totalDamageShieldedOnTeammates = response.totalDamageShieldedOnTeammates,
                totalDamageTaken = response.totalDamageTaken,
                totalMinionsKilled = response.totalMinionsKilled,
                visionScore = response.visionScore,
                visionWardsBoughtInGame = response.visionWardsBoughtInGame,
                wardsKilled = response.wardsKilled,
                wardsPlaced = response.wardsPlaced,
                win = response.win,
            )
        }
    }
}