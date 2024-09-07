package com.example.aula_calculadora

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NoticiaMarcal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_noticia_marcal)
        var voltar = findViewById<ImageView>(R.id.imgVoltarMarcal)
        voltar.setOnClickListener{
            var intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}