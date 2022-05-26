package com.bangkit.capstone.nutri_a.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.bangkit.capstone.nutri_a.R

class RecommendFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend_food)

        val spinner: Spinner = findViewById(R.id.inputIngredients)
            // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.input_ingredients,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
        actionBar?.title = "Rekomendasi Makanan"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}