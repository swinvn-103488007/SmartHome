package com.isilab.smarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.profile

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.dashboard -> {
                    startActivity(Intent(this, DashboardActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.room -> {
                    startActivity(Intent(this, RoomActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.statistics -> {
                    startActivity(Intent(this, PowerUsageActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.profile -> {
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}