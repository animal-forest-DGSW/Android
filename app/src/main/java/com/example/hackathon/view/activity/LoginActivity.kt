package com.example.hackathon.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.hackathon.R
import com.example.hackathon.databinding.ActivityLoginBinding
import com.example.hackathon.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    private val binding = ActivityLoginBinding.inflate(layoutInflater)
    private val viewModel:LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding.btnLogin.setOnClickListener {
            if(viewModel.startMain()){
                startActivity(Intent(this@LoginActivity,MainActivity::class.java))
            }
        }
        binding.btnLogin.setOnClickListener {
            if(viewModel.startSignUp()){
                startActivity(Intent(this@LoginActivity,SignUpActivity::class.java))
            }
        }
    }
}