package com.example.jetpdemo.ui.navigation

import BrandsList
import PostDataApi
import SolutionList
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpdemo.ui.theme.dashboard.DashboardScreen
import com.example.jetpdemo.ui.theme.my_account_page.MyAccountPage

@Composable
fun NavigationComponent(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") {
            DashboardScreen(navController = navController)
        }
        composable("solutions") {
            SolutionList()
        }
        composable("brands") {
            BrandsList()
        }
        composable("account") {
//            PostDataApi()
            MyAccountPage()
//            ScreenContent("Account")
        }
    }
}

@Composable
fun ScreenContent(title: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = title, style = MaterialTheme.typography.headlineLarge)
    }

}
