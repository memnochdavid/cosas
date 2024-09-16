package com.example.cosas

import android.os.Bundle
import android.widget.Button
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val texto=findViewById<TextView>(R.id.texto)
        val texto2=findViewById<TextView>(R.id.texto)
        val boton=findViewById<Button>(R.id.boton)
        var cont=0
        boton.setOnClickListener{
            if(cont%2==0){
                texto.text="Hola Mundo"
                cont++
            }else{
                texto.text="Hola Mundo 2"
                cont++
            }
        }




    }
}