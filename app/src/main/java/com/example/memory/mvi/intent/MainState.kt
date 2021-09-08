package com.example.memory.mvi.intent

import com.example.memory.mvi.data.model.User

/**
 * @author user
 * @date 08.09.2021
 */
sealed class MainState {

    object Idle: MainState()

    object Loading: MainState()

    data class Users(val users: List<User>): MainState()

    data class Error(val error: String?): MainState()
}
