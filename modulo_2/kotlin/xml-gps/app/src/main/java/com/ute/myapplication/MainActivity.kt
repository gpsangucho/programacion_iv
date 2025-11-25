package com.ute.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var saludar = "Hola"
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn =findViewById<Button>(R.id.btn1)
        val txt = findViewById<TextView>(R.id.tex1)

        fun saludo(saludo: String){
            txt.text = saludo
        }
        btn.setOnClickListener {
            contador ++
            when (contador) {
            1 -> saludo("Hola uno")
            2 -> saludo("Saludo dos")
            3 -> saludo("Saludo tres")
            else -> {
                saludo("bye")
                contador = 0
            }

            }
        }
    }
}