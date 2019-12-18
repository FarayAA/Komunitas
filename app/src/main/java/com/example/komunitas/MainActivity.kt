package com.example.komunitas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var akun: CardView
    private lateinit var komunitass: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        akun = findViewById(R.id.user)
        akun.setOnClickListener{
            startActivity(Intent(this, User::class.java))
        }
        komunitass = findViewById(R.id.komunitas)
        komunitass.setOnClickListener {
            startActivity(Intent(this, Komunitas::class.java))
        }
    }
}
