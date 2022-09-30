package com.example.idmrelax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {

        val intent: Intent = Intent(this, Breath:: class.java)
            startActivity(intent)
        }

        val bton: Button = findViewById(R.id.button2)
        bton.setOnClickListener {

            val intent: Intent = Intent(this, Hear:: class.java)
            startActivity(intent)
        }

        val regresar: Button = findViewById(R.id.button9)
        regresar.setOnClickListener {

            val intent: Intent = Intent(this, Login:: class.java)
            startActivity(intent)
        }
    }
}