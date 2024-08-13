package com.example.olx.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.olx.R

class BuyActivity : AppCompatActivity(){
    private lateinit var c_stationary: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        c_stationary = findViewById(R.id.stationary)

        c_stationary.setOnClickListener {
            val intent = Intent(this, StationaryActivity::class.java)
            startActivity(intent)
        }
    }
}