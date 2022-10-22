package edu.gatech.seclass.rollingdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgDice: ImageView = findViewById(R.id.imageViewDice)
        val diceButton: Button =  findViewById(R.id.btnRoll);
        diceButton.setOnClickListener{
           var randInt = Random().nextInt(6)+1
           var drawableResource =  when(randInt){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            imgDice.setImageResource(drawableResource)
        }

    }




}