package com.example.tilelottery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    internal lateinit var tile1: Button
    internal lateinit var tile2: Button
    internal lateinit var tile3: Button
    internal lateinit var tile4: Button
    internal lateinit var tile5: Button
    internal lateinit var tile6: Button
    internal lateinit var tile7: Button
    internal lateinit var tile8: Button
    internal lateinit var tile9: Button
    internal lateinit var tile10: Button
    internal lateinit var tile11: Button
    internal lateinit var tile12: Button
    internal lateinit var tile13: Button
    internal lateinit var tile14: Button
    internal lateinit var tile15: Button
    private lateinit var balance: TextView

    private var coins = 0

    companion object {
        private val SCORE_KEY = "SCORE_KEY"
    }

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
            changeScore()
        }
        tile2.setOnClickListener { view ->
            Toast.makeText(this, "Tile 2 works.", Toast.LENGTH_LONG).show()
        }
        tile3.setOnClickListener { view ->
            Toast.makeText(this, "Tile 3 works.", Toast.LENGTH_LONG).show()
        }
        tile4.setOnClickListener { view ->
            Toast.makeText(this, "Tile 4 works.", Toast.LENGTH_LONG).show()
        }
        tile5.setOnClickListener { view ->
            Toast.makeText(this, "Tile 5 works.", Toast.LENGTH_LONG).show()
        }
        tile6.setOnClickListener { view ->
            Toast.makeText(this, "Tile 6 works.", Toast.LENGTH_LONG).show()
        }
        tile7.setOnClickListener { view ->
            Toast.makeText(this, "Tile 7 works.", Toast.LENGTH_LONG).show()
        }
        tile8.setOnClickListener { view ->
            Toast.makeText(this, "Tile 8 works.", Toast.LENGTH_LONG).show()
        }
        tile9.setOnClickListener { view ->
            Toast.makeText(this, "Tile 9 works.", Toast.LENGTH_LONG).show()
        }
        tile10.setOnClickListener { view ->
            Toast.makeText(this, "Tile 10 works.", Toast.LENGTH_LONG).show()
        }
        tile11.setOnClickListener { view ->
            Toast.makeText(this, "Tile 11 works.", Toast.LENGTH_LONG).show()
        }
        tile12.setOnClickListener { view ->
            Toast.makeText(this, "Tile 12 works.", Toast.LENGTH_LONG).show()
        }
        tile13.setOnClickListener { view ->
            Toast.makeText(this, "Tile 13 works.", Toast.LENGTH_LONG).show()
        }
        tile14.setOnClickListener { view ->
            Toast.makeText(this, "Tile 14 works.", Toast.LENGTH_LONG).show()
        }
        tile15.setOnClickListener { view ->
            Toast.makeText(this, "Tile 15 works.", Toast.LENGTH_LONG).show()
        }
    }

    private fun changeScore() {//the

//        when ((1..10).random()) {
//            1 or 2 or 3 or 4 or 5-> win()
//            6 ->  Toast.makeText(this, "neither", Toast.LENGTH_SHORT).show()
//            7 or 8 or 9 or 10 -> loss()
//        }
        val lotNum = (1..10).random()
        when(lotNum){
            in 2..5, 10 -> win()
            1 -> Toast.makeText(this, "neither", Toast.LENGTH_SHORT).show()
            in 6..9 -> loss()
        }
        balance.text = getString(R.string.score, coins.toString())
//        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink)
//        balance.startAnimation(blinkAnimation)
    }

    private fun loss() {
        coins --
        Toast.makeText(this, "loss", Toast.LENGTH_SHORT).show()
    }

    private fun win() {
        coins ++
        Toast.makeText(this, "win", Toast.LENGTH_SHORT).show()
    }

}