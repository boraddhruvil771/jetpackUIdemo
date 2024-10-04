package com.example.jetpdemo.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(navController: NavController) {
    NavigationBar {

        data class BottomNavItem(
            val label: String,
            val icon: ImageVector,
            val route: String
        )

        val bottomNavItems = listOf(
            BottomNavItem("Home", Icons.Default.Home, "dashboard"),
            BottomNavItem("Brands", Icons.Default.AddCircle, "brands"),
            BottomNavItem("Solutions", Icons.Default.Call, "solutions"),
            BottomNavItem("Account", Icons.Default.AccountBox, "account")
        )

        val currentRoute = navController.currentBackStackEntry?.destination?.route
        bottomNavItems.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route)
                    }
                }
            )
        }
    }
}
