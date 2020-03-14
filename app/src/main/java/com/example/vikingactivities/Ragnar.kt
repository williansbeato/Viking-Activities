package com.example.vikingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_ragnar.*


class Ragnar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)


        val lagertha = findViewById<Button>(R.id.bLagertha)
        bLagertha.setOnClickListener {
            val intent = Intent(this, Lagertha::class.java)
            startActivity(intent)

        }

        val bjorn = findViewById<Button>(R.id.bBjorn)
        bBjorn.setOnClickListener {
            val intent = Intent(this, Bjorn::class.java)
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
