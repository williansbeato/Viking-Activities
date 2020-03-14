package com.example.vikingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val athelstan = findViewById<Button>(R.id.bAthelstan)
        bAthelstan.setOnClickListener {
            val intent = Intent(this, Athelstan::class.java)
            startActivity(intent)

        }

        val floki = findViewById<Button>(R.id.bFloki)
        bFloki.setOnClickListener {
            val intent = Intent(this, Floki::class.java)
            startActivity(intent)

        }

        val ragnar = findViewById<Button>(R.id.bRagnar)
        bRagnar.setOnClickListener {
            val intent = Intent(this, Ragnar::class.java)
            startActivity(intent)

        }

        val bjorn = findViewById<Button>(R.id.bBjorn)
        bBjorn.setOnClickListener {
            val intent = Intent(this, Bjorn::class.java)
            startActivity(intent)

        }

        val rollo = findViewById<Button>(R.id.bRollo)
        bRollo.setOnClickListener {
            val intent = Intent(this, Rollo::class.java)
            startActivity(intent)

        }

        val lagertha = findViewById<Button>(R.id.bLagertha)
        bLagartha.setOnClickListener {
            val intent = Intent(this, Lagertha::class.java)
            startActivity(intent)

        }

    }
}
