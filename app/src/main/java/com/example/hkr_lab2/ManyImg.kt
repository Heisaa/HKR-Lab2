package com.example.hkr_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class ManyImg : AppCompatActivity() {
    private lateinit var recyclerGrid: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_many_img)


        val images = ArrayList<Int>()
        images.add(R.drawable.corey)
        images.add(R.drawable.eberhard)
        images.add(R.drawable.erik)
        images.add(R.drawable.marek)
        images.add(R.drawable.martin)
        images.add(R.drawable.white)

        recyclerGrid = findViewById<RecyclerView>(R.id.recyclerGrid)
        recyclerGrid.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerGrid.adapter = GridAdapter(this, images)

    }
}