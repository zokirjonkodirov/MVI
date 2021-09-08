package com.example.memory.mvi.data.model

import com.squareup.moshi.Json

/**
 * @author user
 * @date 08.09.2021
 */
data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)
