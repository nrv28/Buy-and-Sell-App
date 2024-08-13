package com.example.olx.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.olx.Models.User
import com.example.olx.R
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    private lateinit var user: User
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextEmail = findViewById(R.id.Email)
        editTextPassword = findViewById(R.id.Password)
        loginButton = findViewById(R.id.login)

        loginButton.setOnClickListener {
            val email = editTextEmail.text.toString().trim()
            val password = editTextPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Incomplete Details", Toast.LENGTH_SHORT).show()
            } else {
                user = User(name = email, password = password)

                Firebase.auth.signInWithEmailAndPassword(user.name!!, user.password!!)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this@LoginActivity, "Login Successful", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this, BSActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

    }}