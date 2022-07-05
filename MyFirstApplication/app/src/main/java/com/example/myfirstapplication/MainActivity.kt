package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonClick(view: View) {

        val name:EditText = findViewById(R.id.name)
        val getName: TextView = findViewById(R.id.nameDisplay)

        var str: String = name.text.toString()

        getName.setText(str)
    }
}

