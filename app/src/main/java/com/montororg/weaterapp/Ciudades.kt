package com.montororg.weaterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG: String = "com.montororg.weaterapp.ciudades.CIUDAD"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bMexico: Button = findViewById<Button>(R.id.bMexico)
        val bBerlin: Button = findViewById<Button>(R.id.bBerlin)

        bMexico.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-mexico")
            startActivity(intent)
        })

        bBerlin.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-berlin")
            startActivity(intent)
        })


    }
}