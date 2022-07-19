package com.example.hackathon.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private val id = MutableLiveData<String>()
    private var pw = MutableLiveData<String>()

    fun setText() : String{
        return "안녕하세요"
    }
}