package com.manda0101.indonesiaku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.manda0101.indonesiaku.ui.screen.QuizScreen
import com.manda0101.indonesiaku.ui.theme.IndonesiakuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IndonesiakuTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()

                    // Setup the NavHost with a start destination
                    NavHost(navController = navController, startDestination = "quizScreen/0") {
                        composable("quizScreen/{questionIndex}") { backStackEntry ->
                            val questionIndex = backStackEntry.arguments?.getString("questionIndex")?.toInt() ?: 0
                            QuizScreen(navController = navController, questionIndex = questionIndex)
                        }
                        composable("resultScreen/score/{score}") { _ ->
                            // Pass the score and display the result screen here
                        }
                    }
                }
            }
        }
    }
}
