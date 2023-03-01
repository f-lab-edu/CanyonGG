package io.github.seoj17.canyongg.data.local.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "my_user_most_champ",
    foreignKeys = [
        ForeignKey(
            entity = MyUserInfoEntity::class,
            parentColumns = arrayOf("my_user_puuid"),
            childColumns = arrayOf("user_puuid"),
            onDelete = ForeignKey.CASCADE,
        )
    ]
)

data class MyMostChampEntity(
    @PrimaryKey
    @ColumnInfo(name = "name")
    var champName: String,
    @ColumnInfo(name = "user_puuid")
    var userPuuid: String,
    @ColumnInfo(name = "kda")
    var champKda: Double,
    @ColumnInfo(name = "win_rate")
    var champWinRate: Int,
)