package com.example.bankingappui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bankingappui.data.BottomNavigation

/**
 * Created by Mert Yazi
 */
 
@Composable
fun BottomNavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigation.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(route = BottomNavigation.Home.route) {
            HomeScreen()
        }
        composable(route = BottomNavigation.Wallet.route) {
            WalletScreen()
        }
        composable(route = BottomNavigation.Notifications.route) {
            NotificationsScreen()
        }
        composable(route = BottomNavigation.Account.route) {
            AccountScreen()
        }
    }
}