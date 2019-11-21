package com.example.basicloginapp

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        R.layout.activity_main

        val btnLogin = findViewById<Button>(R.id.BtnLogin)
        val Register = findViewById<TextView>(R.id.Register)

        btnLogin.setOnClickListener {
            val LoginIntent = Intent(this@MainActivity, LoginActivity::class.java)
            val options : ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, btnLogin, "button")
            startActivity(LoginIntent, options.toBundle())
        }

        Register.setOnClickListener {
            val RegistrationIntent = Intent(this@MainActivity, RegistrationActivity::class.java)
            RegistrationIntent.putExtra("Back", "Welcome")
            startActivity(RegistrationIntent)
        }
    }
}
















