package com.javadsh98.constraintlayout_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_movie.setOnClickListener{ _ -> startActivity(Intent(this, MovieActivity::class.java))}
        button_cupcake.setOnClickListener { _ -> startActivity(Intent(this, CupcakeActivity::class.java)) }

    }
}