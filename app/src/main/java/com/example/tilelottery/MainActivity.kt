package com.example.tilelottery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var tile1: Button
    private lateinit var tile2: Button
    private lateinit var tile3: Button
    private lateinit var tile4: Button
    private lateinit var tile5: Button
    private lateinit var tile6: Button
    private lateinit var tile7: Button
    private lateinit var tile8: Button
    private lateinit var tile9: Button
    private lateinit var tile10: Button
    private lateinit var tile11: Button
    private lateinit var tile12: Button
    private lateinit var tile13: Button
    private lateinit var tile14: Button
    private lateinit var tile15: Button
    private lateinit var balance: TextView

    private var coins = 0
    private var lot1 = Random.nextBoolean()
    private var lot2 = Random.nextBoolean()
    private var lot3 = Random.nextBoolean()
    private var lot4 = Random.nextBoolean()
    private var lot5 = Random.nextBoolean()
    private var lot6 = Random.nextBoolean()
    private var lot7 = Random.nextBoolean()
    private var lot8 = Random.nextBoolean()
    private var lot9 = Random.nextBoolean()
    private var lot10 = Random.nextBoolean()
    private var lot11 = Random.nextBoolean()
    private var lot12 = Random.nextBoolean()
    private var lot13 = Random.nextBoolean()
    private var lot14 = Random.nextBoolean()
    private var lot15 = Random.nextBoolean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tile1 = findViewById(R.id.tile1)
        tile2 = findViewById(R.id.tile2)
        tile3 = findViewById(R.id.tile3)
        tile4 = findViewById(R.id.tile4)
        tile5 = findViewById(R.id.tile5)
        tile6 = findViewById(R.id.tile6)
        tile7 = findViewById(R.id.tile7)
        tile8 = findViewById(R.id.tile8)
        tile9 = findViewById(R.id.tile9)
        tile10 = findViewById(R.id.tile10)
        tile11 = findViewById(R.id.tile11)
        tile12 = findViewById(R.id.tile12)
        tile13 = findViewById(R.id.tile13)
        tile14 = findViewById(R.id.tile14)
        tile15 = findViewById(R.id.tile15)
        balance = findViewById(R.id.balanceCounter)

        tile1.setOnClickListener { view ->
            checkLot()
        }
        tile2.setOnClickListener { view ->
            checkLot()
        }
        tile3.setOnClickListener { view ->
            checkLot()
        }
        tile4.setOnClickListener { view ->
            checkLot()
        }
        tile5.setOnClickListener { view ->
            checkLot()
        }
        tile6.setOnClickListener { view ->
            checkLot()
        }
        tile7.setOnClickListener { view ->
            checkLot()
        }
        tile8.setOnClickListener { view ->
            checkLot()
        }
        tile9.setOnClickListener { view ->
            checkLot()
        }
        tile10.setOnClickListener { view ->
            checkLot()
        }
        tile11.setOnClickListener { view ->
            checkLot()
        }
        tile12.setOnClickListener { view ->
            checkLot()
        }
        tile13.setOnClickListener { view ->
            checkLot()
        }
        tile14.setOnClickListener { view ->
            checkLot()
        }
        tile15.setOnClickListener { view ->
            checkLot()
        }
    }

    private fun checkLot() {
        if (
            lot1
        ) win()
        else if (
            !lot1
        ) loss()
        //also make this tile disabled until round restarts.
    }

    private fun updateScore() {//the
        balance.text = getString(R.string.score, coins.toString())
//        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink)
//        balance.startAnimation(blinkAnimation)
    }

    private fun nothing() {
        Toast.makeText(this, "you earned nothing", Toast.LENGTH_SHORT).show()
        updateScore()// and make tile black
    }

    private fun loss() {
        coins --
        Toast.makeText(this, "you lost 1 coin", Toast.LENGTH_SHORT).show()
        updateScore()// and make tile red
    }

    private fun win() {
        coins ++
        Toast.makeText(this, "you won 1 coin", Toast.LENGTH_SHORT).show()
        updateScore()// and make tile green
    }

    private fun shuffleTiles() {
        TODO("Not yet implemented")//randomize the tiles' value as to weather ots a win, loss, or neither, and reset all tile colors back to navy blue
    }

}