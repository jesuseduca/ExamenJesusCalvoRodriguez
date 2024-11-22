package com.example.examen1jesscalvorodriguez

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botonCYL = findViewById<Button>(R.id.buttoncylTV)

        botonCYL.setOnClickListener {
            val intent = Intent(this,Titulos_Activity::class.java)
            startActivity(intent)
        }


        }
    }
