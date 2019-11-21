package com.example.basicloginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val Register = findViewById<Button>(R.id.BtnRegister) as Button
        val Login = findViewById<TextView>(R.id.Login) as TextView
        val BackArrow = findViewById<ImageButton>(R.id.BackArrow) as ImageButton
        var Back : String? = intent.getStringExtra("Back")


        Register.setOnClickListener {
            Toast.makeText(this, "Registration Complete!", Toast.LENGTH_LONG).show()
        }

        Login.setOnClickListener {
            val LoginIntent = Intent(this@RegistrationActivity, LoginActivity::class.java)
            LoginIntent.putExtra("Wel", "Welcome")
            startActivity(LoginIntent)
        }

        BackArrow.setOnClickListener {
            if(Back == "Login"){
                val Loginintent = Intent(this@RegistrationActivity, LoginActivity::class.java)
                startActivity(Loginintent)
            }else{
                val MainIntent = Intent(this@RegistrationActivity, MainActivity::class.java)
                startActivity(MainIntent)
            }
        }
    }

    override fun onBackPressed() {

        var Back2 : String? = intent.getStringExtra("Back")

        if(Back2 == "Login"){
            val Loginintent = Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(Loginintent)
        }else{
            val MainIntent = Intent(this@RegistrationActivity, MainActivity::class.java)
            startActivity(MainIntent)
        }
    }
}
























