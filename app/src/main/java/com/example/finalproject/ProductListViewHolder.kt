package com.example.finalproject

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ProductListViewHolder(view: View) : RecyclerView.ViewHolder(view){
    var name: TextView = view.findViewById(R.id.textView)
    var logo: ImageView = view.findViewById(R.id.logo)
}