package com.example.aula_calculadora

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnMarcal = findViewById<Button>(R.id.btnSaibaMaisMarcal)
        var btnTabata = findViewById<Button>(R.id.btnSaibaMaisTabata)
        var btnQuemSomos  = findViewById<Button>(R.id.btnQuemSomos)
        btnMarcal.setOnClickListener{
            var intent = Intent(this, NoticiaMarcal::class.java)
            startActivity(intent)
        }
        btnTabata.setOnClickListener {
            var intent = Intent(this, NoticiaTabata::class.java)
            startActivity(intent)
        }
        btnQuemSomos.setOnClickListener {
            var intent = Intent(this, SobreNos::class.java)
            startActivity(intent)
        }


    }
}