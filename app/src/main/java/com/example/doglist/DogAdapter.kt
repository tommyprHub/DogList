package com.example.doglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(
    private val images: List<String>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val viewHolder =
            DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                onItemClick(images[position])
            }
        }
        return viewHolder
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item: String = images[position]
        holder.bind(item)
    }
}
