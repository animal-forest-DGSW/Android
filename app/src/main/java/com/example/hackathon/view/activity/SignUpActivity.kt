package com.example.hackathon.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.hackathon.R
import com.example.hackathon.databinding.ActivitySignUpBinding
import com.example.hackathon.viewmodel.SignUpViewModel

class SignUpActivity : AppCompatActivity(){
    private val viewModel : SignUpViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            if(viewModel.startLogin())
                startActivity(Intent(this@SignUpActivity,LoginActivity::class.java))
        }

    }
}