package com.manda0101.indonesiaku.ui.screen

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manda0101.indonesiaku.ui.viewmodel.QuizViewModel

@Composable
fun ResultScreen(score: Int, navController: NavController, quizViewModel: QuizViewModel) {
    val context = LocalContext.current // Get the current context

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Skor Anda: $score",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            quizViewModel.resetScore()
            navController.navigate("quizScreen/0") {
                popUpTo("languageSelection") { inclusive = true }
            }
        }) {
            Text("Mulai Lagi")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { shareQuizResult(score, context) }) {
            Text("Bagikan Hasil")
        }
    }
}

fun shareQuizResult(score: Int, context: Context) {
    val shareIntent = Intent(Intent.ACTION_SEND)
    shareIntent.type = "text/plain"
    val message = "Saya baru saja menyelesaikan kuis IndonesiaKu! Skor saya: $score"
    shareIntent.putExtra(Intent.EXTRA_TEXT, message)

    try {
        context.startActivity(Intent.createChooser(shareIntent, "Bagikan Hasil"))
    } catch (_: Exception) {

    }
}
