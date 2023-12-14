package com.liulishuo.okdownload.benchmark

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView
import com.liulishuo.okdownload.benchmark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = NavigationBarView.OnItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                mainBinding.message.setText(R.string.title_home)
                return@OnItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                mainBinding.message.setText(R.string.title_dashboard)
                return@OnItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                mainBinding.message.setText(R.string.title_notifications)
                return@OnItemSelectedListener true
            }
        }
        false
    }

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        mainBinding.navigation.setOnItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
