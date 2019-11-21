package com.example.basicloginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.widget.*
import kotlinx.android.synthetic.main.activity_registration.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // All the variables :
        val BtnLogin = findViewById<Button>(R.id.BtnLogin)
        val Register = findViewById<TextView>(R.id.Register)
        val BackArrow = findViewById<ImageButton>(R.id.BackArrow)
        val Wel : String? = intent.getStringExtra("Wel")



        Register.setOnClickListener {
            val RegistrationIntent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            RegistrationIntent.putExtra("Back", "Login")
            startActivity(RegistrationIntent)
        }

        BackArrow.setOnClickListener {
            if(Wel == "Welcome"){
                val WelcomeIntent = Intent(this@LoginActivity, MainActivity::class.java)
                val options : ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, BtnLogin, "button")
                startActivity(WelcomeIntent, options.toBundle())
            }else{
                val WelcomeIntent = Intent(this@LoginActivity, MainActivity::class.java)
                val options : ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, BtnLogin, "button")
                startActivity(WelcomeIntent, options.toBundle())
            }

        }

        BtnLogin.setOnClickListener {
            Toast.makeText(this, "Login Successful, Welcome!", Toast.LENGTH_LONG).show()
        }
    }

    override fun onBackPressed() {

        var Wel2 : String? = intent.getStringExtra("Wel")
        val BTNLogin = findViewById<Button>(R.id.BtnLogin) as Button

        if(Wel2 == "Welcome"){
            val WelcomeIntent = Intent(this@LoginActivity, MainActivity::class.java)
            val options : ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, BTNLogin, "button")
            startActivity(WelcomeIntent, options.toBundle())
        }else{
            val WelcomeIntent = Intent(this@LoginActivity, MainActivity::class.java)
            val options : ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, BTNLogin, "button")
            startActivity(WelcomeIntent, options.toBundle())
        }
    }
}




