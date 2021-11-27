package jp.techacademy.hiromi.kakoo.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        val value1 = intent.getStringExtra("VALUE1")

        if(value1 != null) {
            textView.text = value1.toString()
        }

    }
}