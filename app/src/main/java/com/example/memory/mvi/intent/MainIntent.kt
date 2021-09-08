package com.example.memory.mvi.intent

/**
 * @author user
 * @date 08.09.2021
 */
sealed class MainIntent {

    object FetchUser: MainIntent()
}