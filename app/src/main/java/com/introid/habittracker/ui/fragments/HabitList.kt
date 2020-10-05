package com.introid.habittracker.ui.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.introid.habittracker.R
import kotlinx.android.synthetic.main.fragment_habit_list.*


class HabitList : Fragment(R.layout.fragment_habit_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab_add.setOnClickListener{
            findNavController().navigate(R.id.action_habitList_to_createHabitItem)
        }

    }

}