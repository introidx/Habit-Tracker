package com.introid.habittracker.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "habit_table")
data class Habit(
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    var habit_title : String,
    var habit_description : String,
    var habit_startTime : String,
    var imageId: Int
) : Parcelable