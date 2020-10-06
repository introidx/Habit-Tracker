package com.introid.habittracker.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.introid.habittracker.R
import com.introid.habittracker.data.models.IntroView
import kotlinx.android.synthetic.main.intro_item_page.view.*

class ViewPagerAdapter(introViews: List<IntroView>) :
    RecyclerView.Adapter<ViewPagerAdapter.IntroViewHolder>() {

    private val list = introViews

    class IntroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        return IntroViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.intro_item_page, parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        val currentView = list[position]
        holder.itemView.iv_image_intro.setImageResource(currentView.imageId)
        holder.itemView.tv_description_intro.text = currentView.description
    }
}