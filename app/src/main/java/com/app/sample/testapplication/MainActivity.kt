package com.app.sample.testapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setView()
    }

    private fun setView() {
        // Button の定義
        val btn: Button = findViewById(R.id.test_btn1) as Button
        btn.setOnClickListener {
            val intent = Intent(this, TransitionActivity::class.java)
            startActivity(intent)
        }

        // CheckBox の定義
        val checkbox: CheckBox = findViewById(R.id.main_checkbox) as CheckBox
        checkbox.setOnCheckedChangeListener { compoundButton, check ->
            if (check) {
                compoundButton.setText(R.string.check_on)
            } else {
                compoundButton.setText(R.string.check_off)
            }
        }

        // RadioButton の定義
        val radioBtnGroup: RadioGroup = findViewById(R.id.radio_btn_group) as RadioGroup
        radioBtnGroup.setOnCheckedChangeListener { radioGroup, i ->

            val radioText: TextView = findViewById(R.id.radio_text) as TextView

            when (radioGroup.checkedRadioButtonId) {
                R.id.radio_btn1 -> radioText.setText(R.string.radio_btn1)
                R.id.radio_btn2 -> radioText.setText(R.string.radio_btn2)
                R.id.radio_btn3 -> radioText.setText(R.string.radio_btn3)
                else -> Log.e("RadioButton Error", " 想定外のラベルです ")
            }
        }
    }
}
