package com.manda0101.indonesiaku.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    QuizScreen(navController = navController)
}
