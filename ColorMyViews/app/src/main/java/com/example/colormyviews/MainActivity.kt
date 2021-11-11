package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.constraintLayout)
        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFiveText, boxFourText, constraintLayout)
            for (item in clickableViews) {
                item.setOnClickListener{ makeColored(it) }
            }
        }
    }

    private fun makeColored(view: View) {
        binding.apply {
            when (view.id) {

                // Boxes using Color class colors for background
                boxOneText.id -> view.setBackgroundColor(Color.DKGRAY)
                boxTwoText.id  -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                boxThreeText.id -> view.setBackgroundResource(android.R.color.holo_green_light)
                boxFourText.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
                boxFiveText.id -> view.setBackgroundResource(android.R.color.holo_green_light)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }

        }
    }
}