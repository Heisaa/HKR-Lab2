package com.example.hkr_lab2

import android.content.Context
import android.graphics.BitmapFactory
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class GridAdapter(private val context: Context, private val images: ArrayList<Int>) : RecyclerView.Adapter<GridAdapter.ColorViewHolder>() {

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        return ColorViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        val id = images[position]
        val myBitmap = BitmapFactory.decodeResource(context.resources, id);
        holder.iv.setImageBitmap(myBitmap)
    }

    class ColorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val iv: ImageView = view.findViewById<ImageView>(R.id.imageView)
    }
}