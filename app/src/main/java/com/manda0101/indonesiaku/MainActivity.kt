package com.manda0101.indonesiaku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.manda0101.indonesiaku.ui.screen.LanguageSelectionScreen
import com.manda0101.indonesiaku.ui.screen.QuizScreen
import com.manda0101.indonesiaku.ui.screen.ResultScreen
import com.manda0101.indonesiaku.ui.theme.IndonesiakuTheme
import com.manda0101.indonesiaku.ui.viewmodel.QuizViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IndonesiakuTheme {
                val navController = rememberNavController()
                val quizViewModel: QuizViewModel = viewModel()

<<<<<<< HEAD
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
=======
>>>>>>> 14baeaa (0.5 Tampilan images)
                    NavHost(navController = navController, startDestination = "languageSelection") {
                        composable("languageSelection") {
                            LanguageSelectionScreen(navController = navController)
                        }
                        composable("quizScreen/{questionIndex}") { backStackEntry ->
                            val questionIndex = backStackEntry.arguments?.getString("questionIndex")?.toInt() ?: 0
                            QuizScreen(navController = navController, questionIndex = questionIndex, quizViewModel = quizViewModel)
                        }
                        composable("resultScreen/score/{score}") { backStackEntry ->
                            val score = backStackEntry.arguments?.getString("score")?.toInt() ?: 0
<<<<<<< HEAD
                            ResultScreen(score = score, navController = navController, quizViewModel = quizViewModel)
=======
                            ResultScreen(score = score, navController = navController)
>>>>>>> 14baeaa (0.5 Tampilan images)
                        }
                    }
                }
            }
        }
    }
}
