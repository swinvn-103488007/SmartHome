package com.isilab.smarthome

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import com.google.android.material.bottomnavigation.BottomNavigationView

class PowerUsageActivity : AppCompatActivity() {
    lateinit var barChart: BarChart
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_power_usage)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.statistics

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
                    true
                }
                R.id.profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                else -> {
                    false
                }
            }
        }

        barChart=findViewById(R.id.bar_chart)


        val list: ArrayList<BarEntry> = ArrayList()

        list.add(BarEntry(100f,100f))
        list.add(BarEntry(101f,200f))
        list.add(BarEntry(102f,300f))
        list.add(BarEntry(103f,400f))
//        list.add(BarEntry(104f,500f))

        val barDataSet= BarDataSet(list,"List")

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)
        barDataSet.valueTextColor=Color.BLACK

        val barData= BarData(barDataSet)

        barChart.setFitBars(true)

        barChart.data= barData

        barChart.description.text= "Bar Chart"

        barChart.animateY(2000)







    }
}