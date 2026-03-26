package com.example.exerciciocontrolefluxo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(
    onUserButtonClick: () -> Unit,
    onAdminButtonClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Bem-vindo",
            style = TextStyle(fontSize = 16.sp)
        )
        Text(
            text = "Escolha a forma de logar",
            style = TextStyle(fontSize = 12.sp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(
                modifier = Modifier.padding(8.dp),
                onClick = onAdminButtonClick
            ) {
                Text("Admin")
            }
            Button(
                modifier = Modifier.padding(8.dp),
                onClick = onUserButtonClick
            ) {
                Text("User")
            }
        }

    }

}