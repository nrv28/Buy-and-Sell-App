package com.example.olx.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.olx.R


class BSActivity : AppCompatActivity() {
    private lateinit var buyButton: Button
    private lateinit var sellButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bsactivity)

        buyButton = findViewById(R.id.buy)
        sellButton = findViewById(R.id.sell)

        buyButton.setOnClickListener {
            val intent = Intent(this, BuyActivity::class.java)
            startActivity(intent)
        }

        sellButton.setOnClickListener {
            val intent = Intent(this, Sellactivity::class.java)
            startActivity(intent)
        }


    }}