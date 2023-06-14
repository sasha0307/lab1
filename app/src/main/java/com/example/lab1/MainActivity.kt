package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.showButton)
        button.setOnClickListener{
            val inText=findViewById<EditText>(R.id.inputText)
            val outText=findViewById<TextView>(R.id.outText)
            outText.text=inText.text.toString()
        }
    }
}