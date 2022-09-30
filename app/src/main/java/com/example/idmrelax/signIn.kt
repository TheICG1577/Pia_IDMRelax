package com.example.idmrelax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class signIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val newUser_psw = findViewById<EditText>(R.id.newUser_psw)
        val confNewUser_psw = findViewById<EditText>(R.id.confNewUser_psw)
        val showHideBtn = findViewById<TextView>(R.id.show_hide2)
        val showHideBtn2 = findViewById<TextView>(R.id.show_hide3)

        showHideBtn.setOnClickListener {
            if(showHideBtn.text.toString().equals("Show")){
                newUser_psw.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn.text = "Hide"
            } else{
                newUser_psw.transformationMethod = PasswordTransformationMethod.getInstance()
                showHideBtn.text = "Show"
            }
        }
        showHideBtn2.setOnClickListener {
            if(showHideBtn2.text.toString().equals("Show")){
                confNewUser_psw.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn2.text = "Hide"
            } else{
                confNewUser_psw.transformationMethod = PasswordTransformationMethod.getInstance()
                showHideBtn2.text = "Show"
            }
        }

        val crear = findViewById<Button>(R.id.newAccount)
        crear.setOnClickListener {
            val intent: Intent = Intent(this, Login:: class.java)
            startActivity(intent)
        }
        val salir = findViewById<Button>(R.id.back)
        salir.setOnClickListener {
            val intent: Intent = Intent(this, Login:: class.java)
            startActivity(intent)
        }
    }
}