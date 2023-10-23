package com.example.ejmplo_botones

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var texto:TextView = findViewById(R.id.textViewSaludo)
        var botonSaludar: Button = findViewById(R.id.bontonSaludar)

        texto.visibility = View.INVISIBLE

        botonSaludar.setOnClickListener {
            saludar()

            true
        }


    }
    @SuppressLint("ResourceType")
    public fun saludar(){
        var texto:TextView = findViewById(R.id.textViewSaludo)
        var botonSaludar:Button = findViewById(R.id.bontonSaludar)


        if(texto.visibility==View.INVISIBLE){
            texto.visibility = View.VISIBLE
            botonSaludar.text=resources.getString(R.string.bontonSaludar)
        }
    }
}