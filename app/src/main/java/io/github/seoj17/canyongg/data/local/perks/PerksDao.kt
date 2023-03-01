package io.github.seoj17.canyongg.data.local.perks

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PerksDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: PerksEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: List<PerksEntity>)

    @Query("DELETE FROM perk_info WHERE id = :id")
    suspend fun delete(id: Int)

    @Query("DELETE FROM perk_info")
    suspend fun deleteAll()

    @Query("SELECT * FROM perk_info WHERE id = :id")
    suspend fun getPerk(id: Int): PerksEntity

    @Query("SELECT * FROM perk_info WHERE name = :name")
    suspend fun getPerk(name: String): PerksEntity
}