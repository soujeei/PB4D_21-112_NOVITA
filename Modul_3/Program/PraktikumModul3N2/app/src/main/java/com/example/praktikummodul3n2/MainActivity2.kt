package com.example.praktikummodul3n2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val  button2 : Button = findViewById(R.id.button2)

        button2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://lens.google"));
            startActivity(intent)
        }
    }
}