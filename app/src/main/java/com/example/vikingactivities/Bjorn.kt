package com.example.vikingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_bjorn.*


class Bjorn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)



        val athelstan = findViewById<Button>(R.id.bAthelstan)
        bAthelstan.setOnClickListener {
            val intent = Intent(this, Athelstan::class.java)
            startActivity(intent)

        }

        val lagertha = findViewById<Button>(R.id.bLagertha)
        bLagertha.setOnClickListener {
            val intent = Intent(this, Lagertha::class.java)
            startActivity(intent)

        }

        val ragnar = findViewById<Button>(R.id.bRagnar)
        bRagnar.setOnClickListener {
            val intent = Intent(this, Ragnar::class.java)
            startActivity(intent)

        }

        val floki = findViewById<Button>(R.id.bFloki)
        bFloki.setOnClickListener {
            val intent = Intent(this, Floki::class.java)
            startActivity(intent)

        }

        val home = findViewById<Button>(R.id.bHome)
        bHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}
