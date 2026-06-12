package com.example.smart_apotek.admin.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.smart_apotek.R
import com.example.smart_apotek.admin.firebase.FirebaseManager

class LoginAdminActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_admin)

        initView()

        btnLogin.setOnClickListener {
            loginAdmin()
        }
    }

    private fun initView() {
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
    }

    private fun loginAdmin() {

        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()

        if (email.isEmpty()) {
            etEmail.error = "Email tidak boleh kosong"
            return
        }

        if (password.isEmpty()) {
            etPassword.error = "Password tidak boleh kosong"
            return
        }

        if (email == "admin@gmail.com" &&
            password == "123456") {

            Toast.makeText(
                this,
                "Login Berhasil",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(
                    this,
                    DashboardAdminActivity::class.java
                )
            )

            finish()

        } else {

            Toast.makeText(
                this,
                "Email atau Password Salah",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}