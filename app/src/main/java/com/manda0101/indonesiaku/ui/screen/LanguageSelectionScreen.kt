package com.manda0101.indonesiaku.ui.screen

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import java.util.Locale

@Composable
fun LanguageSelectionScreen(navController: NavController) {
    val context = LocalContext.current
    val sharedPreferences: SharedPreferences = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    val language = sharedPreferences.getString("language", "id") ?: "id"
    var selectedLanguage by remember { mutableStateOf(language) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Pilih Bahasa", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedLanguage == "id",
                onClick = {
                    selectedLanguage = "id"
                    setLanguage("id", context)
                    Toast.makeText(context, "Bahasa Indonesia dipilih", Toast.LENGTH_SHORT).show()
                }
            )
            Text(text = "Bahasa Indonesia")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedLanguage == "en",
                onClick = {
                    selectedLanguage = "en"
                    setLanguage("en", context)
                    Toast.makeText(context, "English selected", Toast.LENGTH_SHORT).show()
                }
            )
            Text(text = "English")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("quizScreen/0")
        }) {
            Text("Mulai Kuis")
        }
    }
}

fun setLanguage(language: String, context: Context) {
    val locale = if (language == "en") {
        Locale("en", "US")
    } else {
        Locale("id", "ID")
    }

    Locale.setDefault(locale)
    val config = context.resources.configuration
    config.setLocale(locale)

    val sharedPreferences = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    with(sharedPreferences.edit()) {
        putString("language", language)
        apply()
    }

    context.createConfigurationContext(config)
}