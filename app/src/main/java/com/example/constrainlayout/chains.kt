package com.example.constrainlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class chains : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chains)
        val profilebtn = findViewById<Button>(R.id.button5)

        profilebtn.setOnClickListener {
            val intent = Intent(this,consLayout::class.java)
            startActivity(intent)
        }
        println("Hello ")
        println("InExperimental branch")
    }
}