package com.example.abhinavhomework
import android.util.Log

class User(
    private val username: String,
    private var password: String,
    private val email: String,
    private var locked: Boolean
) {
    fun logUserInfo() {
        Log.i("User Info", "Username: $username, Email: $email")
    }

    fun lock() {
        locked = true
    }

    fun unlock() {
        locked = false
    }

    fun changePassword(newPassword: String) {
        password = newPassword
    }
}