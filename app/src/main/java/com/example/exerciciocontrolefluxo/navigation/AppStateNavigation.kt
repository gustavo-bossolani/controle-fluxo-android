package com.example.exerciciocontrolefluxo.navigation

import androidx.compose.runtime.Composable
import com.example.exerciciocontrolefluxo.screens.LoadingScreen
import com.example.exerciciocontrolefluxo.screens.Login

@Composable
fun AppStateNavigation(
    isLoggedIn: Boolean,
    isAdminUser: Boolean,
    isLoading: Boolean,
    login: () -> Unit,
    loginAsAdmin: () -> Unit,
    logout: () -> Unit
) {
    when {
        isLoading -> LoadingScreen()
        isLoggedIn -> HomeNavGraph(
            isAdminUser = isAdminUser,
            logout = logout
        )
        else -> Login(
            onUserButtonClick = login,
            onAdminButtonClick = loginAsAdmin
        )
    }
}