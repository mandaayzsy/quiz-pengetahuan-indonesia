package com.manda0101.indonesiaku.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manda0101.indonesiaku.R
import com.manda0101.indonesiaku.model.quizList
import com.manda0101.indonesiaku.ui.viewmodel.QuizViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(navController: NavController, questionIndex: Int = 0, quizViewModel: QuizViewModel) {
    val context = LocalContext.current
    val question = quizList[questionIndex]
    val score = quizViewModel.score.intValue

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.Indonesiaku))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding).padding(16.dp)) {
            Text(
                text = "Skor Saat Ini: $score",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = question.question,
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
            )

            question.imageResId?.let { imageResId ->
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(vertical = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                itemsIndexed(question.options.chunked(2)) { _, options ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        options.forEachIndexed { index, option ->
                            Button(
                                modifier = Modifier.weight(1f),
                                onClick = {
                                    val isCorrect = index == question.correctAnswer
                                    if (isCorrect) {
                                        quizViewModel.addScore()
                                        Toast.makeText(context, "Jawaban Benar!", Toast.LENGTH_SHORT).show()
                                    } else {
                                        Toast.makeText(context, "Jawaban Salah!", Toast.LENGTH_SHORT).show()
                                    }

                                    // Navigasi ke soal berikutnya atau ke hasil
                                    if (questionIndex < quizList.size - 1) {
                                        navController.navigate("quizScreen/${questionIndex + 1}")
                                    } else {
                                        navController.navigate("resultScreen/score/${quizViewModel.score.intValue}")
                                    }
                                }
                            ) {
                                Text(text = option)
                            }
                        }
                    }
                }
            }
        }
    }
}