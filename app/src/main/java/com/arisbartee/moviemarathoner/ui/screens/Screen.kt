package com.arisbartee.moviemarathoner.ui.screens

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.arisbartee.moviemarathoner.R

 open class Screen(val route: String, @StringRes val resourceId: Int, val icon: ImageVector = Icons.Default.Clear) {
    object Home : Screen(route = "home", resourceId = R.string.home, icon = Icons.Filled.Home)
    object Catalog : Screen( route = "catalog", resourceId = R.string.catalog, icon = Icons.Filled.List)
    object Marathons : Screen( route = "marathons", resourceId = R.string.marathons, icon = Icons.Filled.Star)
}