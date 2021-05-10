package com.example.shittyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sign_in()
    }

    private fun sign_in() {
        val email = findViewById<TextInputEditText>(R.id.enter_Email)
        val password = findViewById<TextInputEditText>(R.id.enterPassword)
        val loginButton = findViewById<MaterialButton>(R.id.signIn)

        loginButton.setOnClickListener() {
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Email or Password is not Provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.toString() == "user@mail.com" && password.toString() == "user1234") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}