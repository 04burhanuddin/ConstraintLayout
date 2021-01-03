package com.modul4.burhanuddin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),  View.OnClickListener {

    private lateinit var img : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.goTugas)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.goTugas -> {
                val keHome = Intent(this@MainActivity, TugasPraktikum::class.java)
                startActivity(keHome)
            }
        }
    }
}