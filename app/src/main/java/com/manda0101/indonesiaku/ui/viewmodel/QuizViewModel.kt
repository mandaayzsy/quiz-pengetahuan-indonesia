package com.manda0101.indonesiaku.ui.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

    val score = mutableIntStateOf(0)
    fun addScore() {
        score.value += 1
    }
    fun resetScore() {
        score.value = 0
    }
}