package com.example.exerciciocontrolefluxo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.example.exerciciocontrolefluxo.viewmodel.AppViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.exerciciocontrolefluxo.navigation.AppStateNavigation
import kotlinx.coroutines.delay

@Composable
fun App() {
    val appViewModel: AppViewModel = viewModel()

    LaunchedEffect(Unit) {
        delay(5000)
        appViewModel.isLoading = false
    }

    AppStateNavigation(
        isLoggedIn = appViewModel.isLoggedIn,
        isAdminUser = appViewModel.isAdminUser,
        isLoading = appViewModel.isLoading,
        login = { appViewModel.login() },
        loginAsAdmin = { appViewModel.loginAsAdmin() },
        logout = { appViewModel.logout() }
    )
}