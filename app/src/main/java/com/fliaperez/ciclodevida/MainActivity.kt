package com.fliaperez.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var valorContadorResu:Int = 0
    var valorContadorRest:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSiguiente: Button = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener(){
            val intent = Intent(this, view2::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        val textContResu = findViewById<TextView>(R.id.textoContadorResumen)
        valorContadorResu++
        textContResu.text = valorContadorResu.toString()
    }

    override fun onRestart() {
        super.onRestart()
        val textContRest = findViewById<TextView>(R.id.textoContadorRestart)
        valorContadorRest++
        textContRest.text = valorContadorRest.toString()
    }
}