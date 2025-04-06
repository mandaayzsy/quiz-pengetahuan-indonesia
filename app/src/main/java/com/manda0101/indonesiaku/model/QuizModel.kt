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
<<<<<<< HEAD
        "1. Apa ibu kota Indonesia?",
=======
        "Apa ibu kota Indonesia?",
>>>>>>> 14baeaa (0.5 Tampilan images)
        listOf("Jakarta", "Bandung", "Surabaya", "Medan"),
        0,
        null
    ),
    QuizQuestion(
<<<<<<< HEAD
        "2. Siapa Presiden pertama Indonesia?",
=======
        "Siapa Presiden pertama Indonesia?",
>>>>>>> 14baeaa (0.5 Tampilan images)
        listOf("Soeharto", "Soekarno", "BJ Habibie", "Jokowi"),
        1,
        null
    ),
    QuizQuestion(
<<<<<<< HEAD
        "3. Berapa jumlah provinsi di Indonesia?",
=======
        "Berapa jumlah provinsi di Indonesia?",
>>>>>>> 14baeaa (0.5 Tampilan images)
        listOf("32", "34", "33", "35"),
        1,
        null
    ),
    QuizQuestion(
        "4. Di mana terletak Candi Borobudur?",
        listOf("Magelang", "Yogyakarta", "Surabaya", "Jakarta"),
        0,
        R.drawable.borobudur_temple
    ),
    QuizQuestion(
        "5. Apa warna bendera Indonesia?",
        listOf("Merah dan Putih", "Merah dan Biru", "Hijau dan Putih", "Putih dan Kuning"),
        0,
        null
    ),
    QuizQuestion(
<<<<<<< HEAD
        "6. Dimana letak Taman Nasional Komodo?",
=======
        "Dimana letak Taman Nasional Komodo?",
>>>>>>> 14baeaa (0.5 Tampilan images)
        listOf("Bali","Nusa Tenggara Timur", "Sumatra", "Sulawesi"),
        1,
        R.drawable.pulau_komodo
    ),
    QuizQuestion(
        "7. Siapa Presiden Indonesia saat ini?",
        listOf("Prabowo", "Megawati", "Jokowi", "Anies"),
        0,
        null
    ),
    QuizQuestion(
<<<<<<< HEAD
        "8. Apa bahasa resmi Indonesia?",
=======
        "Apa bahasa resmi Indonesia?",
>>>>>>> 14baeaa (0.5 Tampilan images)
        listOf("Bahasa Inggris", "Bahasa Indonesia", "Bahasa Jawa", "Bahasa Sunda"),
        1,
        null
    ),
    QuizQuestion(
        "9. Kapan Indonesia merdeka?",
        listOf("17 Agustus 1945", "20 Mei 1908", "28 Oktober 1928", "8 Maret 1942"),
        0,
        null
    ),
    QuizQuestion(
<<<<<<< HEAD
        "10. Apa nama pulau terbesar di Indonesia?",
        listOf("Papua", "Sumatra", "Borneo", "Jawa"),
        2,
=======
        "Apa nama pulau terbesar di Indonesia?",
        listOf("Papua", "Sumatra", "Borneo", "Jawa"),
        0,
>>>>>>> 14baeaa (0.5 Tampilan images)
        null
    )
)