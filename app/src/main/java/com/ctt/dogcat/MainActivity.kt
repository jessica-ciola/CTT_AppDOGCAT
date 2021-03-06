package com.ctt.dogcat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    lateinit var botaoDog: ImageButton
    lateinit var  botaoCat: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoDog = findViewById(R.id.btndog)
        botaoCat = findViewById(R.id.btncat)

        botaoDog.setOnClickListener{
            startActivity(Intent(this,DoggActivity::class.java))
        }

        botaoCat.setOnClickListener{
            startActivity(Intent(this,CatsActivity::class.java))
        }


    }


}