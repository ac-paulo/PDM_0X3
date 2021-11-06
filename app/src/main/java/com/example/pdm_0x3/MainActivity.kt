package com.example.pdm_0x3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btNewColor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btNewColor = findViewById(R.id.btnNewColor)

        this.btNewColor.setOnClickListener{
            val intent = Intent(this, ColorFormActivity::class.java)
            startActivity(intent)
        }
    }
}