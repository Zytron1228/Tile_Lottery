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
            changeScore()
        }
        tile3.setOnClickListener { view ->
            changeScore()
        }
        tile4.setOnClickListener { view ->
            changeScore()
        }
        tile5.setOnClickListener { view ->
            changeScore()
        }
        tile6.setOnClickListener { view ->
            changeScore()
        }
        tile7.setOnClickListener { view ->
            changeScore()
        }
        tile8.setOnClickListener { view ->
            changeScore()
        }
        tile9.setOnClickListener { view ->
            changeScore()
        }
        tile10.setOnClickListener { view ->
            changeScore()
        }
        tile11.setOnClickListener { view ->
            changeScore()
        }
        tile12.setOnClickListener { view ->
            changeScore()
        }
        tile13.setOnClickListener { view ->
            changeScore()
        }
        tile14.setOnClickListener { view ->
            changeScore()
        }
        tile15.setOnClickListener { view ->
            changeScore()
        }
    }

    private fun changeScore() {//the

        val lotNum = (1..10).random()
        when(lotNum){
            in 2..5, 10 -> win()
            1 -> nothing()
            in 6..9 -> loss()
        }
        balance.text = getString(R.string.score, coins.toString())
//        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink)
//        balance.startAnimation(blinkAnimation)
    }

    private fun nothing() {
        Toast.makeText(this, "you earned nothing", Toast.LENGTH_SHORT).show()
    }

    private fun loss() {
        coins --
        Toast.makeText(this, "you lost 1 coin", Toast.LENGTH_SHORT).show()
    }

    private fun win() {
        coins ++
        Toast.makeText(this, "you won 1 coin", Toast.LENGTH_SHORT).show()
    }

}