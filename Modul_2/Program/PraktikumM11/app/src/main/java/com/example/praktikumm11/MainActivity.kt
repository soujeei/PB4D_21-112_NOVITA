package com.example.praktikumm11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login = findViewById(R.id.btn_login)
        btn_login.setOnClickListener(this)

    }

    override fun onClick(v: View){
       when (v.id){
           R.id.btn_login -> kotlin.run {
               val intentbiasa = Intent(this@MainActivity, MainActivity2::class.java)
               startActivity(intentbiasa)
           }
       }
    }
}