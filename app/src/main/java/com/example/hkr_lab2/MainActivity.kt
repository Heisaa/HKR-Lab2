package com.example.hkr_lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide text button
        val buttonHideText = findViewById<Button>(R.id.buttonHideText)
        val textHide = findViewById<TextView>(R.id.textViewHide)

        buttonHideText.setOnClickListener {
            textHide.visibility = if (textHide.visibility == View.INVISIBLE) {
                buttonHideText.text = "Hide text"
                View.VISIBLE
            } else {
                buttonHideText.text = "Show text"
                View.INVISIBLE
            }
        }

        // One image button
        val buttonOneImg = findViewById<Button>(R.id.buttonOneImg)

        buttonOneImg.setOnClickListener {
            val oneImgIntent = Intent(this, OneImage::class.java)

            startActivity(oneImgIntent)
        }

        // Many image button
        val buttonManyImg = findViewById<Button>(R.id.buttonManyImg)

        buttonManyImg.setOnClickListener {
            val manyImgIntent = Intent(this, ManyImg::class.java)

            startActivity(manyImgIntent)
        }
    }
}