package com.introid.habittracker.logic.repository

import androidx.lifecycle.LiveData
import com.introid.habittracker.data.models.Habit
import com.introid.habittracker.logic.dao.HabitDao

class HabitRepository (private val habitDao: HabitDao) {
    val getAllHabits: LiveData<List<Habit>> = habitDao.getAllHabit()

    suspend fun addHabit(habit: Habit){
        habitDao.addHabit(habit)
    }

    suspend fun updateHabit(habit: Habit){
        habitDao.updateHabit(habit)
    }
    suspend fun deleteHabit(habit: Habit){
        habitDao.deleteHabit(habit)
    }
    suspend fun deleteAll(){
        habitDao.deleteAll()
    }


}