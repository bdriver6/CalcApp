package jp.techacademy.hiromi.kakoo.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPlus.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)
        buttonTimes.setOnClickListener(this)
        buttonDivide.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var N1: Double?
        var N2: Double?
        var NN1: String?
        var NN2: String?
        var Ans: Double? = 0.0
        val rootLayout: View = findViewById(android.R.id.content)
        val snackbar = Snackbar.make(rootLayout , "入力して下さい", Snackbar.LENGTH_LONG)

        NN1 =num1.text.toString()
        NN2 =num2.text.toString()

        if ( NN1 == "") {
            snackbar.show()
        }
        else  if ( NN2 == "") {
            snackbar.show()
        }
        else {

            N1 = num1.text.toString().toDouble()
            N2 = num2.text.toString().toDouble()

            if (v != null) {

                val intent = Intent(this, AnswerActivity::class.java)

                if (v.id == R.id.buttonPlus) {
                    Ans = N1 + N2

                } else if (v.id == R.id.buttonMinus) {
                    Ans = N1 - N2

                } else if (v.id == R.id.buttonTimes) {
                    Ans = N1 * N2

                } else if (v.id == R.id.buttonDivide) {
                    Ans = N1 / N2

                }

                intent.putExtra("VALUE1", Ans.toString())
                startActivity(intent)

            }

        }
    }


}

