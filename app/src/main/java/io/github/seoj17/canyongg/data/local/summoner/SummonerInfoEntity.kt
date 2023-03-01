package io.github.seoj17.canyongg.data.local.summoner

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "summoner_info")
data class SummonerInfoEntity(
    @PrimaryKey
    @ColumnInfo(name = "puuid")
    var puuid: String,
    @ColumnInfo(name = "profile")
    var profile: Int,
    @ColumnInfo(name = "level")
    var level: Int,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "tier")
    var tier: String,
    @ColumnInfo(name = "whole_match")
    var wholeMatch: Int,
    @ColumnInfo(name = "win")
    var win: Int,
    @ColumnInfo(name = "lose")
    var lose: Int,
    @ColumnInfo(name = "win_rate")
    var winRate: Int,
    @ColumnInfo(name = "kda")
    var kda: Double,
    @ColumnInfo(name = "largest_kill")
    var largestKill: Int,
)