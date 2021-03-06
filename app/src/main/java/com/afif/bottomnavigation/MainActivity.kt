package com.afif.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomView)
        val navController = findNavController(R.id.fragment)
        val appAppBarConfiguration = AppBarConfiguration(setOf(R.id.newReleaseFragment, R.id.favoriteFragment, R.id.featuredFragment, R.id.settingFragment))
        setupActionBarWithNavController(navController, appAppBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)
    }
}