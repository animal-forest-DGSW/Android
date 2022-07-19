package com.example.hackathon.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    val id = MutableLiveData<String>()
    val pw = MutableLiveData<String>()
    fun startLogin():Boolean{
        return true
    }
}