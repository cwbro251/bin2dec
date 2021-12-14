package com.example.bin2dec

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var input: EditText? = null
    private var output: EditText? = null
    private var submit: Button? = null
    private var reset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.editText)
        output = findViewById(R.id.output)
        submit = findViewById(R.id.submit)

        submit!!.setOnClickListener {
            val string = input!!.text.toString()
            val i = string.toInt()
            val binary = Integer.toBinaryString(i)
            output!!.setText(binary)
        }

        reset = findViewById(R.id.reset)
//
        reset!!.setOnClickListener {
            input!!.setText("")
            output!!.setText("")
        }
    }
}