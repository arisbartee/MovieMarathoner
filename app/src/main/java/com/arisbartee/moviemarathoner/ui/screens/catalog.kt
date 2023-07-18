package com.arisbartee.moviemarathoner.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CatalogScreen(
    bottomBar: @Composable () -> Unit
){
    Scaffold(
        bottomBar =  bottomBar
    ) {paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            Text(text = "Pick a movie and we'll generate a list of recommendations.")
            Row{
                TextField(
                    value = "",
                    onValueChange = { },
                    placeholder = { Text("Search film...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) }
                )
            }
        }
    }
}