package com.example.hackathon.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val id = MutableLiveData<String>()
    val pw = MutableLiveData<String>()
    fun startMain():Boolean{
        return true
    }
    fun startSignUp():Boolean{
        return true
    }
}