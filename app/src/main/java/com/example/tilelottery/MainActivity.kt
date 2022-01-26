package com.example.tilelottery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    //tiles
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
    //win blocks
    private lateinit var wBlock1: Button
    private lateinit var wBlock2: Button
    private lateinit var wBlock3: Button
    private lateinit var wBlock4: Button
    private lateinit var wBlock5: Button
    private lateinit var wBlock6: Button
    private lateinit var wBlock7: Button
    private lateinit var wBlock8: Button
    private lateinit var wBlock9: Button
    private lateinit var wBlock10: Button
    private lateinit var wBlock11: Button
    private lateinit var wBlock12: Button
    private lateinit var wBlock13: Button
    private lateinit var wBlock14: Button
    private lateinit var wBlock15: Button
    //loss blocks
    private lateinit var lBlock1: Button
    private lateinit var lBlock2: Button
    private lateinit var lBlock3: Button
    private lateinit var lBlock4: Button
    private lateinit var lBlock5: Button
    private lateinit var lBlock6: Button
    private lateinit var lBlock7: Button
    private lateinit var lBlock8: Button
    private lateinit var lBlock9: Button
    private lateinit var lBlock10: Button
    private lateinit var lBlock11: Button
    private lateinit var lBlock12: Button
    private lateinit var lBlock13: Button
    private lateinit var lBlock14: Button
    private lateinit var lBlock15: Button
    //reward text
    private lateinit var reward1: TextView
    private lateinit var reward2: TextView
    private lateinit var reward3: TextView
    private lateinit var reward4: TextView
    private lateinit var reward5: TextView
    private lateinit var reward6: TextView
    private lateinit var reward7: TextView
    private lateinit var reward8: TextView
    private lateinit var reward9: TextView
    private lateinit var reward10: TextView
    private lateinit var reward11: TextView
    private lateinit var reward12: TextView
    private lateinit var reward13: TextView
    private lateinit var reward14: TextView
    private lateinit var reward15: TextView
    //tile win/loss values
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
    //others
    private lateinit var endRound: Button
    private lateinit var balance: TextView
    private var coins = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tile1 = findViewById(R.id.unopenedTile1)
        tile2 = findViewById(R.id.unopenedTile2)
        tile3 = findViewById(R.id.unopenedTile3)
        tile4 = findViewById(R.id.unopenedTile4)
        tile5 = findViewById(R.id.unopenedTile5)
        tile6 = findViewById(R.id.unopenedTile6)
        tile7 = findViewById(R.id.unopenedTile7)
        tile8 = findViewById(R.id.unopenedTile8)
        tile9 = findViewById(R.id.unopenedTile9)
        tile10 = findViewById(R.id.unopenedTile10)
        tile11 = findViewById(R.id.unopenedTile11)
        tile12 = findViewById(R.id.unopenedTile12)
        tile13 = findViewById(R.id.unopenedTile13)
        tile14 = findViewById(R.id.unopenedTile14)
        tile15 = findViewById(R.id.unopenedTile15)

        wBlock1 = findViewById(R.id.winTile1)
        wBlock2 = findViewById(R.id.winTile2)
        wBlock3 = findViewById(R.id.winTile3)
        wBlock4 = findViewById(R.id.winTile4)
        wBlock5 = findViewById(R.id.winTile5)
        wBlock6 = findViewById(R.id.winTile6)
        wBlock7 = findViewById(R.id.winTile7)
        wBlock8 = findViewById(R.id.winTile8)
        wBlock9 = findViewById(R.id.winTile9)
        wBlock10 = findViewById(R.id.winTile10)
        wBlock11 = findViewById(R.id.winTile11)
        wBlock12 = findViewById(R.id.winTile12)
        wBlock13 = findViewById(R.id.winTile13)
        wBlock14 = findViewById(R.id.winTile14)
        wBlock15 = findViewById(R.id.winTile15)

        lBlock1 = findViewById(R.id.lossTile1)
        lBlock2 = findViewById(R.id.lossTile2)
        lBlock3 = findViewById(R.id.lossTile3)
        lBlock4 = findViewById(R.id.lossTile4)
        lBlock5 = findViewById(R.id.lossTile5)
        lBlock6 = findViewById(R.id.lossTile6)
        lBlock7 = findViewById(R.id.lossTile7)
        lBlock8 = findViewById(R.id.lossTile8)
        lBlock9 = findViewById(R.id.lossTile9)
        lBlock10 = findViewById(R.id.lossTile10)
        lBlock11 = findViewById(R.id.lossTile11)
        lBlock12 = findViewById(R.id.lossTile12)
        lBlock13 = findViewById(R.id.lossTile13)
        lBlock14 = findViewById(R.id.lossTile14)
        lBlock15 = findViewById(R.id.lossTile15)

        reward1 = findViewById(R.id.tilereward1)
        reward2 = findViewById(R.id.tilereward2)
        reward3 = findViewById(R.id.tilereward3)
        reward4 = findViewById(R.id.tilereward4)
        reward5 = findViewById(R.id.tilereward5)
        reward6 = findViewById(R.id.tilereward6)
        reward7 = findViewById(R.id.tilereward7)
        reward8 = findViewById(R.id.tilereward8)
        reward9 = findViewById(R.id.tilereward9)
        reward10 = findViewById(R.id.tilereward10)
        reward11 = findViewById(R.id.tilereward11)
        reward12 = findViewById(R.id.tilereward12)
        reward13 = findViewById(R.id.tilereward13)
        reward14 = findViewById(R.id.tilereward14)
        reward15 = findViewById(R.id.tilereward15)

        endRound = findViewById(R.id.endButton)
        balance = findViewById(R.id.balanceCounter)
        updateScore()
        tile1.setOnClickListener { view ->
            tile1.alpha = 0F
            if (lot1) {
                win()
                wBlock1.alpha = 1F
            } else {
                loss()
                lBlock1.alpha = 1F
            }
            tile1.isClickable = false
        }
        tile2.setOnClickListener { view ->
            tile2.alpha = 0F
            if (lot2) {
                win()
                wBlock2.alpha = 1F
            } else {
                loss()
                lBlock2.alpha = 1F
            }
            tile2.isClickable = false
        }
        tile3.setOnClickListener { view ->
            tile3.alpha = 0F
            if (lot3) {
                win()
                wBlock3.alpha = 1F
            } else {
                loss()
                lBlock3.alpha = 1F
            }
            tile3.isClickable = false
        }
        tile4.setOnClickListener { view ->
            tile4.alpha = 0F
            if (lot4) {
                win()
                wBlock4.alpha = 1F
            } else {
                loss()
                lBlock4.alpha = 1F
            }
            tile4.isClickable = false
        }
        tile5.setOnClickListener { view ->
            tile5.alpha = 0F
            if (lot5) {
                win()
                wBlock5.alpha = 1F
            } else {
                loss()
                lBlock5.alpha = 1F
            }
            tile5.isClickable = false
        }
        tile6.setOnClickListener { view ->
            tile6.alpha = 0F
            if (lot6) {
                win()
                wBlock6.alpha = 1F
            } else {
                loss()
                lBlock6.alpha = 1F
            }
            tile6.isClickable = false
        }
        tile7.setOnClickListener { view ->
            tile7.alpha = 0F
            if (lot7) {
                win()
                wBlock7.alpha = 1F
            } else {
                loss()
                lBlock7.alpha = 1F
            }
            tile7.isClickable = false
        }
        tile8.setOnClickListener { view ->
            tile8.alpha = 0F
            if (lot8) {
                win()
                wBlock8.alpha = 1F
            } else {
                loss()
                lBlock8.alpha = 1F
            }
            tile8.isClickable = false
        }
        tile9.setOnClickListener { view ->
            tile9.alpha = 0F
            if (lot9) {
                win()
                wBlock9.alpha = 1F
            } else {
                loss()
                lBlock9.alpha = 1F
            }
            tile9.isClickable = false
        }
        tile10.setOnClickListener { view ->
            tile10.alpha = 0F
            if (lot10) {
                win()
                wBlock10.alpha = 1F
            } else {
                loss()
                lBlock10.alpha = 1F
            }
            tile10.isClickable = false
        }
        tile11.setOnClickListener { view ->
            tile11.alpha = 0F
            if (lot11) {
                win()
                wBlock11.alpha = 1F
            } else {
                loss()
                lBlock11.alpha = 1F
            }
            tile11.isClickable = false
        }
        tile12.setOnClickListener { view ->
            tile12.alpha = 0F
            if (lot12) {
                win()
                wBlock12.alpha = 1F
            } else {
                loss()
                lBlock12.alpha = 1F
            }
            tile12.isClickable = false
        }
        tile13.setOnClickListener { view ->
            tile13.alpha = 0F
            if (lot13) {
                win()
                wBlock13.alpha = 1F
            } else {
                loss()
                lBlock13.alpha = 1F
            }
            tile13.isClickable = false
        }
        tile14.setOnClickListener { view ->
            tile14.alpha = 0F
            if (lot14) {
                win()
                wBlock14.alpha = 1F
            } else {
                loss()
                lBlock14.alpha = 1F
            }
            tile14.isClickable = false
        }
        tile15.setOnClickListener { view ->
            tile15.alpha = 0F
            if (lot15) {
                win()
                wBlock15.alpha = 1F
            } else {
                loss()
                lBlock15.alpha = 1F
            }
            tile15.isClickable = false
        }
        endRound.setOnClickListener { view ->
            shuffleTiles()
        }
    }

    private fun updateScore() {
        balance.text = getString(R.string.score, coins.toString())

        reward1.text = getString(R.id.tilereward1)

//        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink)
//        balance.startAnimation(blinkAnimation)
    }

//    private fun nothing() {
//        Toast.makeText(this, "you earned nothing", Toast.LENGTH_SHORT).show()
//        updateScore()// and make tile black
//    } // chance of rickroll                              E

    private fun loss() {
        lossMagnitude()
        updateScore()
    }

    private fun winMagnitude() {
        when((1..1000).random()){
            in 1..533 -> win5() //    53.3 %
            in 534..778 -> win25()  //     26.66 %
            in 13..14 -> win100() //    13.33 %
            in 15..188 -> win500()    //    06.66 %
        }
    }

    private fun win500() {
        coins += 500
        Toast.makeText(this, "JACKPOT! You won 500 coins!", Toast.LENGTH_SHORT).show()
    }

    private fun win100() {
        coins += 100
        Toast.makeText(this, "You won 100 coins!", Toast.LENGTH_SHORT).show()
    }

    private fun win25() {
        coins += 25
        Toast.makeText(this, "You won 25 coins.", Toast.LENGTH_SHORT).show()
    }

    private fun win5() {
        coins += 5
        Toast.makeText(this, "You won 5 coins.", Toast.LENGTH_SHORT).show()
    }

    private fun win() {
        winMagnitude()
        updateScore()
    }

    private fun lossMagnitude() {
        when((1..20).random()){
            in 1..8 -> lose5() //    40%
            in 9..18 -> lose25() //  45%
            19,20 -> lose100() //    10%
        }
    }

    private fun lose100() {
        coins -= 100
        Toast.makeText(this, "You lost 100 coins!", Toast.LENGTH_SHORT).show()
    }

    private fun lose25() {
        coins -= 25
        Toast.makeText(this, "You lost 25 coins.", Toast.LENGTH_SHORT).show()
    }

    private fun lose5() {
        coins -= 5
        Toast.makeText(this, "You lost 5 coins.", Toast.LENGTH_SHORT).show();
    }

    private fun shuffleTiles() {
        lot1 = Random.nextBoolean()
        lot2 = Random.nextBoolean()
        lot3 = Random.nextBoolean()
        lot4 = Random.nextBoolean()
        lot5 = Random.nextBoolean()
        lot6 = Random.nextBoolean()
        lot7 = Random.nextBoolean()
        lot8 = Random.nextBoolean()
        lot9 = Random.nextBoolean()
        lot10 = Random.nextBoolean()
        lot11 = Random.nextBoolean()
        lot12 = Random.nextBoolean()
        lot13 = Random.nextBoolean()
        lot14 = Random.nextBoolean()
        lot15 = Random.nextBoolean()
        tile1.isClickable = true
        tile2.isClickable = true
        tile3.isClickable = true
        tile4.isClickable = true
        tile5.isClickable = true
        tile6.isClickable = true
        tile7.isClickable = true
        tile8.isClickable = true
        tile9.isClickable = true
        tile10.isClickable = true
        tile11.isClickable = true
        tile12.isClickable = true
        tile13.isClickable = true
        tile14.isClickable = true
        tile15.isClickable = true
        tile1.alpha = 1F
        tile2.alpha = 1F
        tile3.alpha = 1F
        tile4.alpha = 1F
        tile5.alpha = 1F
        tile6.alpha = 1F
        tile7.alpha = 1F
        tile8.alpha = 1F
        tile9.alpha = 1F
        tile10.alpha = 1F
        tile11.alpha = 1F
        tile12.alpha = 1F
        tile13.alpha = 1F
        tile14.alpha = 1F
        tile15.alpha = 1F
        wBlock1.alpha = 0F
        wBlock2.alpha = 0F
        wBlock3.alpha = 0F
        wBlock4.alpha = 0F
        wBlock5.alpha = 0F
        wBlock6.alpha = 0F
        wBlock7.alpha = 0F
        wBlock8.alpha = 0F
        wBlock9.alpha = 0F
        wBlock10.alpha = 0F
        wBlock11.alpha = 0F
        wBlock12.alpha = 0F
        wBlock13.alpha = 0F
        wBlock14.alpha = 0F
        wBlock15.alpha = 0F
        lBlock1.alpha = 0F
        lBlock2.alpha = 0F
        lBlock3.alpha = 0F
        lBlock4.alpha = 0F
        lBlock5.alpha = 0F
        lBlock6.alpha = 0F
        lBlock7.alpha = 0F
        lBlock8.alpha = 0F
        lBlock9.alpha = 0F
        lBlock10.alpha = 0F
        lBlock11.alpha = 0F
        lBlock12.alpha = 0F
        lBlock13.alpha = 0F
        lBlock14.alpha = 0F
        lBlock15.alpha = 0F
        Toast.makeText(this, "Tiles reshuffled.", Toast.LENGTH_SHORT).show()
    }

}