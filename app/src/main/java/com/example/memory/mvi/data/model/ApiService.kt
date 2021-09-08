package com.example.memory.mvi.data.model

import retrofit2.http.GET

/**
 * @author user
 * @date 08.09.2021
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}