package com.woo_romero.ut_map

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    val query = MutableLiveData<String>()
}