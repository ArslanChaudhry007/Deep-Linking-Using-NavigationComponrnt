package com.ezatpanah.deeplink_navigationcomponent_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.ezatpanah.deeplink_navigationcomponent_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = Navigation.findNavController(this@MainActivity, R.id.navHost)


    }

    override fun onBackPressed() {
        if (navController.currentDestination?.id == R.id.productFragment ) {
            finish()
        }

        super.onBackPressed()
    }
}