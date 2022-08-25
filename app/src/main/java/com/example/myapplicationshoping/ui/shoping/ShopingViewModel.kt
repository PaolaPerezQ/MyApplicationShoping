package com.example.myapplicationshoping.ui.shoping

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShopingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Shoping Fragment"
    }
    val text: LiveData<String> = _text
}