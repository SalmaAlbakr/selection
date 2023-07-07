package com.sm.selection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class FinalScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_screen)


        val finally = intent.extras?.getString("option", "your option")
        val final = findViewById<TextView>(R.id.textView5)
        final.text = finally.toString()

        val againButton = findViewById<Button>(R.id.againButton)

        againButton.setOnClickListener {
            val l = Intent(this, MainActivity::class.java)
            startActivity(l);
        }

    }
}