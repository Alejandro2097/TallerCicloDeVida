package com.fliaperez.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class view2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_next)

        val btnAtras = findViewById<Button>(R.id.btnAtras)
        btnAtras.setOnClickListener(){
                finish()
        }

    }

}