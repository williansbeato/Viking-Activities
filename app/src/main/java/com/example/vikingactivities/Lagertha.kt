package com.example.vikingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_lagertha.*


class Lagertha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        val bjorn = findViewById<Button>(R.id.bBjorn)
        bBjorn.setOnClickListener {
            val intent = Intent(this, Bjorn::class.java)
            startActivity(intent)

        }


        val ragnar = findViewById<Button>(R.id.bRagnar)
        bRagnar.setOnClickListener {
            val intent = Intent(this, Ragnar::class.java)
            startActivity(intent)

        }

        val home = findViewById<Button>(R.id.bHome)
        bHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}
