package com.arisbartee.moviemarathoner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arisbartee.moviemarathoner.ui.parts.MMBottomBar
import com.arisbartee.moviemarathoner.ui.screens.CatalogScreen
import com.arisbartee.moviemarathoner.ui.screens.HomeScreen
import com.arisbartee.moviemarathoner.ui.theme.MovieMarathonerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            val navController = rememberNavController()

            MovieMarathonerTheme {
                NavHost(navController = navController, startDestination = "home"){
                    composable("home"){
                        HomeScreen(
                           bottomBar = { MMBottomBar(navController = navController) }
                        )
                    }
                    composable("catalog"){
                        CatalogScreen(
                            bottomBar = { MMBottomBar(navController = navController) }
                        )
                    }
                }
            }
        }
    }
}

