package com.montororg.weaterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.montororg.weaterapp.R

class MainActivity : AppCompatActivity() {

    var tvCiudad: TextView? = null
    var tvGrados: TextView? = null
    var tvEstatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad: String? = intent.getStringExtra("com.montororg.weaterapp.ciudades.CIUDAD")



        val ciudadmx = Ciudad("ciudad de mexico", 15, "soleado")
        val ciudadBerlin = Ciudad("Berlin", 30, "despejado")

        if (ciudad == "ciudad-mexico"){
            tvCiudad?.text = ciudadmx.nombre
            tvGrados?.text = ciudadmx.grados.toString() + "°"
            tvEstatus?.text = ciudadBerlin.estatus
        }else if (ciudad == "ciudad-berlin"){
            tvCiudad?.text = ciudadBerlin.nombre
            tvGrados?.text = ciudadBerlin.grados.toString() + "°"
            tvEstatus?.text = ciudadBerlin.estatus
        }else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
        }

    }
}