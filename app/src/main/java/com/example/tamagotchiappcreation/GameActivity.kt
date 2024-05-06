package com.example.tamagotchiappcreation

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity





// GameActivity.kt
class GameActivity: AppCompatActivity() {
    private var pet: Pet =Pet()


  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_game)

         updatePetStatus()
        val feedButton: Button =
            findViewById(R.id.feedButtonButton)
        val playButton: Button =
            findViewById(R.id.playButtonButton)
        val cleanButton: Button =
            findViewById(R.id.cleanButton)
        feedButton.setOnClickListener{
            pet.feed ()

            petImage.setImageResource(R.drawable.pet_fed)

            updatePetStatus()

        }
        playButton.setOnClickListener{
            pet.play()

            petImage.setImageResource(R.drawable.pet_happy)
        }
        cleanButton.setOnClickListener {
            pet.clean()
            petImage.setImageResource(R.drawable.pet_clean)
            updatePetStatus()
        }


    }
      private fun updatePetStatus(){
          val petImage: ImageView =
              findViewById(R.id.petImage)
          petImage.setImageResource(pet.imageResource)

          val healthStatus: TextView =
              findViewById(R.id.healthStatus)
          val hungerStatus: TextView =
              findViewById(R.id.hungerStatus)
          val cleanlinessStatus: TextView =
              findViewById(R.id.cleanlinessStatus)

          healthStatus.text = "Health: $ {pet.health}"
          hungerStatus.text ="Hunger: $ {pet.health}"
          cleanlinessStatus.text ="Cleanliness: $ {pet.health}"


      }

    }









