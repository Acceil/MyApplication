package ru.acceil.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieDetails: ImageView = findViewById(R.id.main_activity)
        movieDetails.setOnClickListener { moveToMain() }

    }

    private fun moveToMain() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}