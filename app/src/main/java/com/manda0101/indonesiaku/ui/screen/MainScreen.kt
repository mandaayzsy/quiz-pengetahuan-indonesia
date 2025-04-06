package com.manda0101.indonesiaku.ui.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.manda0101.indonesiaku.ui.viewmodel.QuizViewModel

@Composable
<<<<<<< HEAD
fun MainScreen(navController: NavController) {
    val quizViewModel: QuizViewModel = viewModel()

    QuizScreen(navController = navController, quizViewModel = quizViewModel)
=======
fun MainScreen() {
    val navController = rememberNavController()
    QuizScreen(navController = navController)
>>>>>>> 14baeaa (0.5 Tampilan images)
}