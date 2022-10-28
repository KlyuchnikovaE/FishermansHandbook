package com.example.fishermanshandbook

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContentActivity:AppCompatActivity ()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        var tvTitle = findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = intent.getStringExtra("title")
        var tvContent = findViewById<TextView>(R.id.textView3)
        tvContent.text = intent.getStringExtra("content")
        var im = findViewById<ImageView>(R.id.im)
        im.setImageResource(intent.getIntExtra("image",R.drawable.som))





    }
}