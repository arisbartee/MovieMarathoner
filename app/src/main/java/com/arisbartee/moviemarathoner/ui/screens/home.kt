package com.arisbartee.moviemarathoner.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(){
    Scaffold() {paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ){
            Text("Movie Marathon Mode")
            Text("How much time do you have to spend watching movies?")
            TextField(value = "", onValueChange = {})
            Button(onClick = {}) {
                Text("Find my movies")
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}