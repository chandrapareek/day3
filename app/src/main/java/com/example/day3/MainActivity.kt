package com.example.day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val btn = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.textView)
        val cities = arrayOf("Sahawa","Nohar","Punsisar")

        val aa = ArrayAdapter(this,android.R.layout.simple_spinner_item,cities)
        spinner.adapter = aa

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    btn.setOnClickListener{
                        tv.text = cities[p2]
                    }

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }

            }


    }
}