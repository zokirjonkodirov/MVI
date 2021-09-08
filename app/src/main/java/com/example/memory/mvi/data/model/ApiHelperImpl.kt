package com.example.memory.mvi.data.model

/**
 * @author user
 * @date 08.09.2021
 */
class ApiHelperImpl(private val apiService: ApiService): ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}