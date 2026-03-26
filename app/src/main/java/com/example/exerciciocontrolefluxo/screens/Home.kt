package com.example.exerciciocontrolefluxo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Home(
    navController: NavHostController,
    isAdminUser: Boolean,
    onLogoutButtonClick: () -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val userProfile = if (isAdminUser) "Admin" else "User"
        Text(
            text = "Bem-vindo $userProfile"
        )
        Spacer(modifier = Modifier.height(8.dp))

        if (isAdminUser) {
            Button(
                onClick = { navController.navigate("dashboard") }
            ) {
                Text("Dashboard")
            }

            Spacer(modifier = Modifier.height(8.dp))
        }

        Button(
            onClick = onLogoutButtonClick
        ) {
            Text("Logout")
        }
    }

}