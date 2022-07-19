package com.example.hackathon.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hackathon.R
import com.example.hackathon.viewmodel.LoginViewModel
import com.example.hackathon.viewmodel.MainActivityViewModel

class LoginFragment : Fragment(R.layout.fragment_login){
    private val viewModel : LoginViewModel by viewModels()

}