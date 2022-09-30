package com.example.idmrelax

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Hear : AppCompatActivity() {
    private lateinit var  mep: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hear)



        val btn3=findViewById<Button>(R.id.button3)
        val btn4=findViewById<Button>(R.id.button4)
        val btn5=findViewById<Button>(R.id.button5)
        val btn8=findViewById<Button>(R.id.button8)

        btn3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.waves)
            mp.start()
        }


        btn4.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.rain)
            mp.start()
        }



        btn5.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.med)
            mp.start()
        }

        btn8.setOnClickListener {

            val mp = MediaPlayer.create(this, R.raw.med)
            mp.pause()
        }


        val btn: Button = findViewById(R.id.button6)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
    } }}
