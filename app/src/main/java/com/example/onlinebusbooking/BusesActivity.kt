package com.example.onlinebusbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BusesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buses)

        val textView = findViewById<TextView>(R.id.textView2 )
        textView.setOnClickListener()
        val intent = Intent(this, SeatTicket::class.java)

        startActivity(intent)
    }
}

private fun TextView.setOnClickListener() {
    TODO("Not yet implemented")
}
