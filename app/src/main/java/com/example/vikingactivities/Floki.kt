package com.example.vikingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_floki.*


class Floki : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)


        val home = findViewById<Button>(R.id.bHome)
        bHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        val ragnar = findViewById<Button>(R.id.bRagnar)
        bRagnar.setOnClickListener {
            val intent = Intent(this, Ragnar::class.java)
            startActivity(intent)

        }

    }
}
