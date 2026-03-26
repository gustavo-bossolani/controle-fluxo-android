package com.example.exerciciocontrolefluxo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exerciciocontrolefluxo.screens.AdminDashboard
import com.example.exerciciocontrolefluxo.screens.Home

@Composable
fun HomeNavGraph(
    isAdminUser: Boolean,
    logout: () -> Unit
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            Home(
                isAdminUser = isAdminUser,
                navController = navController,
                onLogoutButtonClick = logout
            )
        }

        composable("dashboard") {
            AdminDashboard(
                navController = navController
            )
        }
    }
}