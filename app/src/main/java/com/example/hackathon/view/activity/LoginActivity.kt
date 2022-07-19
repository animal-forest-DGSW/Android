package com.example.hackathon.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.hackathon.R
import com.example.hackathon.databinding.ActivityLoginBinding
import com.example.hackathon.view.fragment.LoginFragment
import com.example.hackathon.view.fragment.SignUpFragment
import com.example.hackathon.viewmodel.MainViewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginFragment = LoginFragment()
        val signUpFragment = SignUpFragment()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flFragment,loginFragment)
            commit()
        }


    }
}
