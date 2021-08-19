package com.example.onlinebusbooking

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView6)
        textView.setTypeface(null, Typeface.BOLD)

        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener()
        val intent= Intent(this, BusesActivity::class.java)

        startActivity(intent)
    }
}

fun Button.setOnClickListener()

{
    TODO("Not yet implemented")
}
