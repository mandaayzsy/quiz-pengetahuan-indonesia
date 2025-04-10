package com.manda0101.indonesiaku.ui.screen

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CategorySelectionScreen(navController: NavController) {
    val context = LocalContext.current
    val sharedPreferences: SharedPreferences = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    val selectedCategory = sharedPreferences.getString("category", "pelajar") ?: "pelajar"
    var selectedCategoryState by remember { mutableStateOf(selectedCategory) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Pilih Status Anda Saat Ini", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedCategoryState == "pelajar",
                onClick = {
                    selectedCategoryState = "pelajar"
                    setCategory("pelajar", context)
                    Toast.makeText(context, "Status Pelajar dipilih", Toast.LENGTH_SHORT).show()
                }
            )
            Text(text = "Pelajar")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedCategoryState == "mahasiswa",
                onClick = {
                    selectedCategoryState = "mahasiswa"
                    setCategory("mahasiswa", context)
                    Toast.makeText(context, "Status Mahasiswa dipilih", Toast.LENGTH_SHORT).show()
                }
            )
            Text(text = "Mahasiswa")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedCategoryState == "masyarakat",
                onClick = {
                    selectedCategoryState = "masyarakat"
                    setCategory("masyarakat", context)
                    Toast.makeText(context, "Status Masyarakat dipilih", Toast.LENGTH_SHORT).show()
                }
            )
            Text(text = "Masyarakat")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("quizScreen/0") {
                popUpTo("categorySelection") { inclusive = true } // Reset stack jika pindah ke quiz
            }
        }) {
            Text("Mulai Kuis")
        }
    }
}

fun setCategory(category: String, context: Context) {
    val sharedPreferences = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    with(sharedPreferences.edit()) {
        putString("category", category)
        apply()
    }
}
