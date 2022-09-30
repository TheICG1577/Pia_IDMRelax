package com.example.idmrelax

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Breath : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breath)
        val btn: Button = findViewById(R.id.button7)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
    }
        val btn10=findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.brea)
            mp.start()
        }
    }
}
