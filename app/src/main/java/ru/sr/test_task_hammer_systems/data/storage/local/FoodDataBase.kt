package ru.sr.test_task_hammer_systems.data.storage.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [], version = 1)
abstract class FoodDataBase : RoomDatabase() {

    abstract fun createFoodDao(): FoodDao

    companion object {
        fun getInstance(context: Context) =
            Room.databaseBuilder(context, FoodDataBase::class.java, "foods").build()
    }
}

