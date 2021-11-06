package com.example.pdm_0x3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class DisplayColorActivity : AppCompatActivity() {

    private lateinit var layout: ConstraintLayout

    private lateinit var textViewColor: TextView
    private lateinit var btnNewColor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_color)

        this.layout = findViewById(R.id.layoutDisplayColor)
        this.textViewColor = findViewById(R.id.textViewColor)

        if (intent.hasExtra("color")) {
            val color = intent.getStringExtra("color");
            this.textViewColor.text = color
            layout.setBackgroundColor(Color.parseColor(color))
        }

        this.btnNewColor = findViewById(R.id.btnNewColor)

        this.btnNewColor.setOnClickListener{
            val intent = Intent(this, ColorFormActivity::class.java)
            startActivity(intent)
        }
    }
}