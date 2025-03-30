package com.manda0101.indonesiaku.model

import androidx.annotation.DrawableRes

data class  QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int,

    @DrawableRes val imageResId: Int?
)
//daftar soal
val quizList = listOf(
    QuizQuestion(
        "Apa ibu kota Indonesia? ",
        listOf("Jakarta", "Bandung", "Surabaya", "Medan"),
        0,
        null
    ),
    QuizQuestion(
        "Siapa Presiden pertama Indonesia?",
        listOf("Soekarno", "Soeharto", "BJ Habibie", "Jokowi"),
        0,
        null
    ),
    QuizQuestion(
        "Berapa jumlah provinsi di Indonesia?",
        listOf("34", "32", "33", "35"),
        0,
        null
    ),
    QuizQuestion(
        "Di mana terletak Candi Borobudur?",
        listOf("Magelang", "Yogyakarta", "Surabaya", "Jakarta"),
        0,
        null
    ),
    QuizQuestion(
        "Apa warna bendera Indonesia?",
        listOf("Merah dan Putih", "Merah dan Biru", "Hijau dan Putih", "Putih dan Kuning"),
        0,
        null
    ),
    QuizQuestion(
        "Dimana letak Taman Nasional Komodo?",
        listOf("Nusa Tenggara Timur", "Bali", "Sumatra", "Sulawesi"),
        0,
        null
    ),
    QuizQuestion(
        "Siapa Presiden Indonesia saat ini?",
        listOf("Prabowo", "Megawati", "Jokowi", "Anies"),
        0,
        null
    ),
    QuizQuestion(
        "Apa bahasa resmi Indonesia?",
        listOf("Bahasa Indonesia", "Bahasa Inggris", "Bahasa Jawa", "Bahasa Sunda"),
        0,
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
        listOf("Sumatra", "Borneo", "Sulawesi", "Jawa"),
        1,
        null
    )
)