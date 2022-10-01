package com.example.playmarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.R
import com.example.playmarket.models.Program
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_prog.view.*

class InPlayMarketAdapter(var progList : List<Program>) : RecyclerView.Adapter<InPlayMarketAdapter.Vh>() {

    inner class Vh(var itemview : View) : RecyclerView.ViewHolder(itemview){
        fun onBind(program: Program){
            Picasso.get().load(program.imgUrl).into(itemview.img)
            itemview.progName.text = program.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_prog,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(progList[position])
    }

    override fun getItemCount(): Int = progList.size
}