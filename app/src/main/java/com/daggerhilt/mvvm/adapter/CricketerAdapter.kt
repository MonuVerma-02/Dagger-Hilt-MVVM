package com.daggerhilt.mvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.daggerhilt.mvvm.R
import com.daggerhilt.mvvm.model.Cricketer

class CricketerAdapter(private val cricketers: List<Cricketer>) :
    RecyclerView.Adapter<CricketerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cricketers[position])
    }

    override fun getItemCount() = cricketers.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(cricketer: Cricketer) {
            Glide.with(itemView.context)
                .load(cricketer.image)
                .placeholder(R.drawable.ic_default_image)
                .into(itemView.findViewById(R.id.image))

            itemView.findViewById<TextView>(R.id.name).text = cricketer.name
        }
    }
}