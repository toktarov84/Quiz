package com.example.Quiz

internal data class Question(
    val question: String = "",
    val rightAnswer: Int = 0,
    var answer: Int = 4
)
