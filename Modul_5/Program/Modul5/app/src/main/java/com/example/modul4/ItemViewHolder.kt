package com.example.modul4

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView: ImageView = itemView.findViewById(R.id.id1)
    private val textView: TextView = itemView.findViewById(R.id.id2)


    fun bind(CMobilSport: CMobilSport) {
        imageView.setImageResource(CMobilSport.Img)
        textView.text = CMobilSport.name
    }
}