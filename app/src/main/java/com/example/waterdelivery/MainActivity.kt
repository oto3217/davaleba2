package com.example.waterdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val logInButton = findViewById<Button>(R.id.logInButton)
        logInButton.setOnClickListener(View.OnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        })

        val signUpButton = findViewById<Button>(R.id.signUpButton)
        signUpButton.setOnClickListener(View.OnClickListener {
            intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        })
    }
}