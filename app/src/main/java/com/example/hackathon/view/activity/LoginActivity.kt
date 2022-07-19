package com.example.hackathon.view.activity

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.example.hackathon.R
import com.example.hackathon.databinding.ActivityLoginBinding
import com.example.hackathon.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    private val viewModel:LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener(View.OnClickListener {
            if (viewModel.startMain()) {
                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            }
        })
        binding.btnSignup.setOnClickListener(View.OnClickListener {
            if(viewModel.startSignUp()){
                startActivity(Intent(this@LoginActivity, SignUpActivity::class.java))
            }
        })
    }
}