package com.example.playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.R
import com.example.playmarket.models.GeneralData
import kotlinx.android.synthetic.main.item_general.view.*

class PlayMarketAdapter(var generalList: ArrayList<GeneralData>) : RecyclerView.Adapter<PlayMarketAdapter.Vh>(){


    inner class Vh(itemView:View) : RecyclerView.ViewHolder(itemView){
        fun onBind(generalData : GeneralData){
            itemView.title.text = generalData.title
            val inPlayMarketAdapter = InPlayMarketAdapter(generalData.appList!!)
            itemView.inside.adapter = inPlayMarketAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_general, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(generalList[position])
    }

    override fun getItemCount(): Int = generalList.size
}