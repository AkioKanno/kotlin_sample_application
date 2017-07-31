package com.app.sample.testapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.app.sample.testapplication.R.id.finish_btn

class TransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transition)

        val btn: Button = findViewById(finish_btn) as Button
        btn.setOnClickListener { finish() }
    }
}
