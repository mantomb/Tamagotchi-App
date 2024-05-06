package com.example.tamagotchiappcreation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//welcomeActivity.kt
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_welcome`)
        val startButton: Button =
            findViewById(R.id.startButton)
        startButton.setOnClickListener{
            startActivity(
                Intent(this,
                GameActivity::class.java)

            )
        }
    }
}