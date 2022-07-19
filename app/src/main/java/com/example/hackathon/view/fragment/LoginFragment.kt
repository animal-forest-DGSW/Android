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

class LoginFragment : Fragment(){
    private val viewModel : LoginViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        Log.e("LoginFragment", "onCreateView: 실행 완료", )
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}