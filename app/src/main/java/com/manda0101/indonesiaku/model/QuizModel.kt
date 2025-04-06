package com.manda0101.indonesiaku.model

import androidx.annotation.DrawableRes
import com.manda0101.indonesiaku.R

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int,

    @DrawableRes val imageResId: Int?
)

val quizList = listOf(
    QuizQuestion(
        "Apa ibu kota Indonesia?",
        listOf("Jakarta", "Bandung", "Surabaya", "Medan"),
        0,
        null
    ),
    QuizQuestion(
        "Siapa Presiden pertama Indonesia?",
        listOf("Soeharto", "Soekarno", "BJ Habibie", "Jokowi"),
        1,
        null
    ),
    QuizQuestion(
        "Berapa jumlah provinsi di Indonesia?",
        listOf("32", "34", "33", "35"),
        1,
        null
    ),
    QuizQuestion(
        "Di mana terletak Candi Borobudur?",
        listOf("Magelang", "Yogyakarta", "Surabaya", "Jakarta"),
        0,
        R.drawable.borobudur_temple
    ),
    QuizQuestion(
        "Apa warna bendera Indonesia?",
        listOf("Merah dan Putih", "Merah dan Biru", "Hijau dan Putih", "Putih dan Kuning"),
        0,
        null
    ),
    QuizQuestion(
        "Dimana letak Taman Nasional Komodo?",
        listOf("Bali","Nusa Tenggara Timur", "Sumatra", "Sulawesi"),
        1,
        R.drawable.pulau_komodo
    ),
    QuizQuestion(
        "Siapa Presiden Indonesia saat ini?",
        listOf("Prabowo", "Megawati", "Jokowi", "Anies"),
        0,
        null
    ),
    QuizQuestion(
        "Apa bahasa resmi Indonesia?",
        listOf("Bahasa Inggris", "Bahasa Indonesia", "Bahasa Jawa", "Bahasa Sunda"),
        1,
        null
    ),
    QuizQuestion(
        "Kapan Indonesia merdeka?",
        listOf("17 Agustus 1945", "20 Mei 1908", "28 Oktober 1928", "8 Maret 1942"),
        0,
        null
    ),
    QuizQuestion(
        "Apa nama pulau terbesar di Indonesia?",
        listOf("Papua", "Sumatra", "Borneo", "Jawa"),
        0,
        null
    )
)