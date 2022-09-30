package com.example.idmrelax

import android.content.Intent
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import java.net.PasswordAuthentication

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val userName = findViewById<EditText>(R.id.userName)
        val userPassword = findViewById<EditText>(R.id.userPassword)
        val showHideBtn = findViewById<TextView>(R.id.show_hide)

        showHideBtn.setOnClickListener {
            if(showHideBtn.text.toString().equals("Show")){
                userPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn.text = "Hide"
            } else{
                userPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                showHideBtn.text = "Show"
            }
        }

        val ingresar = findViewById<Button>(R.id.loginBtn)
        ingresar.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        val crearNuevo = findViewById<Button>(R.id.signBtn)
        crearNuevo.setOnClickListener {
            val intent: Intent = Intent(this, signIn:: class.java)
            startActivity(intent)
        }
    }
}