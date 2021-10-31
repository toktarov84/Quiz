package com.example.Quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.startActivity

class MainActivity2 : AppCompatActivity() {
    private var index = 0
    private var last = Bridge.questionsList.size - 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        loadQuestion()

        buttonBack.setOnClickListener {
            saveAnswer()
            if (index == 0) {
                startActivity<MainActivity>()
            } else {
                index--
                loadQuestion()
            }
        }

        buttonForward.setOnClickListener {
            saveAnswer()
            if (index == last) {
                startActivity<MainActivity3>()
            } else {
                index++
                loadQuestion()
            }
        }
    }

    private fun saveAnswer() {
        when {
            radioButtonA.isChecked -> Bridge.questionsList[index].answer = 1
            radioButtonB.isChecked -> Bridge.questionsList[index].answer = 2
            radioButtonC.isChecked -> Bridge.questionsList[index].answer = 3
        }
    }

    private fun loadQuestion() {
        textViewQustions.text = Bridge.questionsList[index].question
        radioGroup.clearCheck()
    }
}