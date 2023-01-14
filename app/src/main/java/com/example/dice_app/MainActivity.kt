package com.example.dice_app

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.role.setOnClickListener{

            diceImage1.setImageResource(randomGetDice())
            diceImage2.setImageResource(randomGetDice())
        }
    }

    private fun randomGetDice(): Int {
        val dice = "dice_"+Random.nextInt(1, 6)

        return this.resources.getIdentifier(dice, "drawable", this.packageName)
    }
}