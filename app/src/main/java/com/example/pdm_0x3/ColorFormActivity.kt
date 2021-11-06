package com.example.pdm_0x3

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout

import kotlin.random.Random

class ColorFormActivity : AppCompatActivity() {

    private lateinit var btnCancel: Button
    private lateinit var btnNewColor: Button
    private lateinit var layoutColor: LinearLayout

    private lateinit var seekBar0x1: SeekBar
    private lateinit var seekBar0x2: SeekBar
    private lateinit var seekBar0x3: SeekBar

    private var seekBar0x1Value: Int = 0
    private var seekBar0x2Value: Int = 0
    private var seekBar0x3Value: Int = 0

    private var currentColor: String = "#ffffff"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_form)


        this.btnCancel = findViewById(R.id.btnCancelForm)
        this.btnNewColor = findViewById(R.id.btnNewColor)
        this.layoutColor = findViewById(R.id.layoutColor)

        this.btnCancel.setOnClickListener {
            this.finish()
        }

        this.btnNewColor.setOnClickListener {
            val intent = Intent(this, DisplayColorActivity::class.java).apply {
                putExtra("color", currentColor)
            }
            startActivity(intent)
        }

        this.seekBar0x1 = findViewById(R.id.seekBar0x1)
        this.seekBar0x2 = findViewById(R.id.seekBar0x2)
        this.seekBar0x3 = findViewById(R.id.seekBar0x3)


        seekBar0x1.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                seekBar0x1Value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                currentColor = String.format(
                    "#%02x%02x%02x", seekBar0x1Value, seekBar0x2Value, seekBar0x3Value)
                layoutColor.setBackgroundColor(
                    Color.rgb(seekBar0x1Value, seekBar0x2Value, seekBar0x3Value))
            }
        })

        seekBar0x2.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                seekBar0x2Value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                currentColor = String.format(
                    "#%02x%02x%02x", seekBar0x1Value, seekBar0x2Value, seekBar0x3Value)
                layoutColor.setBackgroundColor(
                    Color.rgb(seekBar0x1Value, seekBar0x2Value, seekBar0x3Value))
            }
        })

        seekBar0x3.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                seekBar0x3Value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                currentColor = String.format(
                    "#%02x%02x%02x", seekBar0x1Value, seekBar0x2Value, seekBar0x3Value)
                layoutColor.setBackgroundColor(
                    Color.rgb(seekBar0x1Value, seekBar0x2Value, seekBar0x3Value))
            }
        })
    }
}