package com.flashcard

import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val textViewQuestion = findViewById<TextView>(R.id.flashcard_question)
        val textViewAnswer = findViewById<TextView>(R.id.flashcard_answer)

        textViewQuestion.setOnClickListener {
            textViewQuestion.visibility = View.INVISIBLE
            textViewAnswer.visibility = View.VISIBLE
        }



        textViewAnswer.setOnClickListener {
            textViewAnswer.visibility = View.INVISIBLE
            textViewQuestion.visibility = View.VISIBLE
        }

        val main = findViewById<RelativeLayout>(R.id.main)
        val textViewAnswer1 = findViewById<TextView>(R.id.answer_1)
        val textViewAnswer2 = findViewById<TextView>(R.id.answer_2)
        val textViewAnswer3 = findViewById<TextView>(R.id.answer_3)

        main.setOnClickListener {
            textViewAnswer1.setBackgroundColor(getResources().getColor(R.color.bg_answer, null))
            textViewAnswer2.setBackgroundColor(getResources().getColor(R.color.bg_answer, null))
            textViewAnswer3.setBackgroundColor(getResources().getColor(R.color.bg_answer, null))
        }

        textViewAnswer1.setOnClickListener {
            textViewAnswer1.setBackgroundColor(getResources().getColor(R.color.red_color, null))
            textViewAnswer2.setBackgroundColor(getResources().getColor(R.color.red_color, null))
            textViewAnswer3.setBackgroundColor(getResources().getColor(R.color.green_color, null))
        }


        textViewAnswer2.setOnClickListener {
            textViewAnswer1.setBackgroundColor(getResources().getColor(R.color.red_color, null))
            textViewAnswer2.setBackgroundColor(getResources().getColor(R.color.red_color, null))
            textViewAnswer3.setBackgroundColor(getResources().getColor(R.color.green_color, null))
        }


        textViewAnswer3.setOnClickListener {
            textViewAnswer1.setBackgroundColor(getResources().getColor(R.color.red_color, null))
            textViewAnswer2.setBackgroundColor(getResources().getColor(R.color.red_color, null))
            textViewAnswer3.setBackgroundColor(getResources().getColor(R.color.green_color, null))
        }

    }
}