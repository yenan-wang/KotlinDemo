package com.ngb.kotlindemo.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ngb.kotlindemo.main.second.homepage.HomePageActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mButton = findViewById<Button>(R.id.button)
        mButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, HomePageActivity::class.java))
        }
    }
}