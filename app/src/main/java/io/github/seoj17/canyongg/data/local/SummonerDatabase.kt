package io.github.seoj17.canyongg.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        RecentSearchNameEntity::class,
        SummonerBookmarkEntity::class,
        ChampionsEntity::class,
        PerksEntity::class
    ],
    version = 1
)
abstract class SummonerDatabase : RoomDatabase() {
    abstract fun recentSearchDao(): RecentSearchDao
    abstract fun summonerBookmarkDao(): SummonerBookmarkDao
    abstract fun championsDao(): ChampionsDao
    abstract fun perksDao(): PerksDao
}