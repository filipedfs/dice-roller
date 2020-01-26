package com.filipefonseca.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Specifies which layout is associate with the activity
        setContentView(R.layout.activity_main)

        // Get the button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            //            // Make a Toast
//            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()

        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }
}