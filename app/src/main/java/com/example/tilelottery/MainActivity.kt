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
    private lateinit var endRound: Button
    private lateinit var balance: TextView
//    internal lateinit var color: color
    public var currentColor ="@color/lotDefault"

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
//    private var lot1Color = @color/lotNeither

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
        endRound = findViewById(R.id.endButton)
        balance = findViewById(R.id.balanceCounter)

        tile1.setOnClickListener { view ->
            checkLot1()
        }
        tile2.setOnClickListener { view ->
            checkLot2()
        }
        tile3.setOnClickListener { view ->
            checkLot3()
        }
        tile4.setOnClickListener { view ->
            checkLot4()
        }
        tile5.setOnClickListener { view ->
            checkLot5()
        }
        tile6.setOnClickListener { view ->
            checkLot6()
        }
        tile7.setOnClickListener { view ->
            checkLot7()
        }
        tile8.setOnClickListener { view ->
            checkLot8()
        }
        tile9.setOnClickListener { view ->
            checkLot9()
        }
        tile10.setOnClickListener { view ->
            checkLot10()
        }
        tile11.setOnClickListener { view ->
            checkLot11()
        }
        tile12.setOnClickListener { view ->
            checkLot12()
        }
        tile13.setOnClickListener { view ->
            checkLot13()
        }
        tile14.setOnClickListener { view ->
            checkLot14()
        }
        tile15.setOnClickListener { view ->
            checkLot15()
        }
        endRound.setOnClickListener { view ->
            shuffleTiles()
        }
    }

    private fun checkLot1() {
        if (lot1) win()
        else if (!lot1) loss()
        //also make this tile disabled until round restarts.
        tile1.isClickable = false
//        tile1.foregr

    }
    private fun checkLot2() {
        if (lot2) win()
        else if (!lot2) loss()
        tile2.isClickable = false
        //also make this tile disabled until round restarts.
    }
    private fun checkLot3() {
        if (lot3) win()
        else if (!lot3) loss()
        tile3.isClickable = false
        //also make this tile disabled until round restarts.
    }
    private fun checkLot4() {
        if (lot4) win()
        else if (!lot4) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot5() {
        if (
            lot5
        ) win()
        else if (
            !lot5
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot6() {
        if (
            lot6
        ) win()
        else if (
            !lot6
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot7() {
        if (
            lot7
        ) win()
        else if (
            !lot7
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot8() {
        if (
            lot8
        ) win()
        else if (
            !lot8
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot9() {
        if (
            lot9
        ) win()
        else if (
            !lot9
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot10() {
        if (
            lot10
        ) win()
        else if (
            !lot10
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot11() {
        if (
            lot11
        ) win()
        else if (
            !lot11
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot12() {
        if (
            lot12
        ) win()
        else if (
            !lot12
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot13() {
        if (
            lot13
        ) win()
        else if (
            !lot13
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot14() {
        if (
            lot14
        ) win()
        else if (
            !lot14
        ) loss()
        //also make this tile disabled until round restarts.
    }
    private fun checkLot15() {
        if (
            lot15
        ) win()
        else if (
            !lot15
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
        lossMagnitude()
        coins -= 5
        Toast.makeText(this, "you lost 5 coins", Toast.LENGTH_SHORT).show()
        updateScore()// and make tile red
    }

    private fun lossMagnitude() {
        TODO("Not yet implemented")
    }

    private fun win() {
        winMagnitude()
        coins += 5
        Toast.makeText(this, "you won 5 coins", Toast.LENGTH_SHORT).show()
        updateScore()// and make tile green
    }

    private fun winMagnitude() {
        TODO("Not yet implemented")
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
        Toast.makeText(this, "Tiles reshuffled.", Toast.LENGTH_SHORT).show()
//        lot1Color =
        //randomize the tiles' value as to weather ots a win, loss, or neither, and reset all tile colors back to navy blue
    }

}