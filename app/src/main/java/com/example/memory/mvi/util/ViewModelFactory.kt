package com.example.memory.mvi.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.memory.mvi.data.model.ApiHelper
import com.example.memory.mvi.data.model.MainRepository
import com.example.memory.mvi.ui.MainViewModel
import java.lang.IllegalArgumentException

/**
 * @author user
 * @date 08.09.2021
 */
class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}