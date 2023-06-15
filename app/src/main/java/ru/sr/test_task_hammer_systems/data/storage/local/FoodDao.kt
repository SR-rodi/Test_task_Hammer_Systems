package ru.sr.test_task_hammer_systems.data.storage.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FoodDao {

    @Insert
    suspend fun insertItems(items: List<MealEntity>)

    @Query("Select * from meals")
    suspend fun getItems(): List<MealEntity>
}