package com.example.exerciciocontrolefluxo.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {

    var isLoggedIn by mutableStateOf(false)
        private set

    var isAdminUser by mutableStateOf(false)
        private set

    var isLoading by mutableStateOf(true)

    fun login() {
        isLoggedIn = true
    }

    fun loginAsAdmin() {
        isLoggedIn = true
        isAdminUser = true
    }

    fun logout() {
        isLoggedIn = false
        isAdminUser = false
    }

}