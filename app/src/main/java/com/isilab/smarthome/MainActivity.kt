package com.isilab.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.start_button)
        startButton.setOnClickListener {
//            startActivity(Intent(this,PowerUsageActivity::class.java))
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}