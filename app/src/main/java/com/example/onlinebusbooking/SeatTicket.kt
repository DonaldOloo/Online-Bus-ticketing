package com.example.onlinebusbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SeatTicket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_ticket)



        val button = findViewById<Button>(R.id.button11)
        button.setOnClickListener()
        val intent = Intent(this,ticketing::class.java)

        startActivity(intent)
    }
}