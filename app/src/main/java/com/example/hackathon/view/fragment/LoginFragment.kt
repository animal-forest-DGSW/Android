package com.example.hackathon.view.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hackathon.R
import com.example.hackathon.viewmodel.LoginViewModel

class LoginFragment : Fragment(R.layout.fragment_login) {
    private val viewModel : LoginViewModel by viewModels()
}