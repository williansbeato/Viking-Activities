package com.example.vikingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val athelstan = findViewById<ImageButton>(R.id.ibAthelstan)
        ibAthelstan.setOnClickListener {
            val intent = Intent(this, Athelstan::class.java)
            startActivity(intent)

        }

        val floki = findViewById<ImageButton>(R.id.ibFloki)
        ibFloki.setOnClickListener {
            val intent = Intent(this, Floki::class.java)
            startActivity(intent)

        }

        val ragnar = findViewById<ImageButton>(R.id.ibRagnar)
        ibRagnar.setOnClickListener {
            val intent = Intent(this, Ragnar::class.java)
            startActivity(intent)

        }

        val bjorn = findViewById<ImageButton>(R.id.ibBjorn)
        ibBjorn.setOnClickListener {
            val intent = Intent(this, Bjorn::class.java)
            startActivity(intent)

        }

        val rollo = findViewById<ImageButton>(R.id.ibRollo)
        ibRollo.setOnClickListener {
            val intent = Intent(this, Rollo::class.java)
            startActivity(intent)

        }

        val lagertha = findViewById<ImageButton>(R.id.ibLagertha)
        ibLagertha.setOnClickListener {
            val intent = Intent(this, Lagertha::class.java)
            startActivity(intent)

        }

    }
}
