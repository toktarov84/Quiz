package com.example.Quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import org.jetbrains.anko.startActivity

class MainActivity3 : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        for (question in Bridge.questionsList) {
            if (question.answer == question.rightAnswer) count++
        }

        when (count) {
            in 0..3 -> textViewResult.text = "Попробуйте ещё.\nВы можете лучше."
            in 4..6 -> textViewResult.text = "Неплохо.\nНо вы можете лучше!"
            in 7..8 -> textViewResult.text = "Хорошо!\nВ целом вы знаете тему."
            else    -> textViewResult.text = "Отлично!\nЯ вижу вы знаток!"
        }

        textViewCount.text = "Вы набрали ${count} из 10"

        buttonStart.setOnClickListener {
            startActivity<MainActivity>()
        }

        buttonExit.setOnClickListener {
            finishAffinity()
        }
    }
}