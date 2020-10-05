package com.introid.habittracker.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.introid.habittracker.data.models.Habit
import com.introid.habittracker.logic.dao.HabitDao

@Database(entities = [Habit::class] , version = 1 , exportSchema = false)
abstract class HabitDatabase : RoomDatabase(){

    abstract fun habitDao() : HabitDao

    companion object{
        @Volatile
        private var INSTANCE : HabitDatabase? = null

        fun getDatabase(context: Context) : HabitDatabase{
            val tempInstance :HabitDatabase? = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance : HabitDatabase = Room.databaseBuilder(
                    context.applicationContext,
                    HabitDatabase::class.java,
                    "habit_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }


}