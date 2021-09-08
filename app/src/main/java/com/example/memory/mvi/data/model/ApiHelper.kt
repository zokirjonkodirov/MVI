package com.example.memory.mvi.data.model

/**
 * @author user
 * @date 08.09.2021
 */
interface ApiHelper {

    suspend fun getUsers(): List<User>
}