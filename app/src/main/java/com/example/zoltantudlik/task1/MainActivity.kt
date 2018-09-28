package com.example.zoltantudlik.task1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var enterButton: Button
    lateinit var inputField: EditText
    lateinit var txtCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterButton = findViewById(R.id.button)
        inputField = findViewById(R.id.textInput)
        txtCount = findViewById(R.id.txtCount)

        enterButton.setOnClickListener { getCharCount() }
    }

    private fun getCharCount() {
        val input: Editable = inputField.text
        val wordCount = input.split(" ").filter{s -> s.isNotEmpty() }.size
        txtCount.text = String.format(getText(R.string.word_count_is).toString(), wordCount)
    }
}