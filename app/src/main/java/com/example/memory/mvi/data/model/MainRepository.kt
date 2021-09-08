package com.example.memory.mvi.data.model

/**
 * @author user
 * @date 08.09.2021
 */
class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}