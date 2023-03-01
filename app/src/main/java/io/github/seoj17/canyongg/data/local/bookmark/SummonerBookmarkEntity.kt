package io.github.seoj17.canyongg.data.local.bookmark

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "summoner_bookmark")
data class SummonerBookmarkEntity(
    @PrimaryKey
    @ColumnInfo(name = "puuid")
    var puuid: String,
    @ColumnInfo(name = "summoner_name")
    var summonerName: String,
    @ColumnInfo(name = "summoner_level")
    var level: Int,
    @ColumnInfo(name = "icon")
    var icon: Int,
)