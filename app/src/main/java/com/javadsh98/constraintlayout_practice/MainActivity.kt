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
        button_circular_demo.setOnClickListener { _ -> startActivity(Intent(this, CircularConstraintActivity::class.java)) }
        button_image_filter_view.setOnClickListener { _ -> startActivity(Intent(this, ImageFilterActivity::class.java)) }
        button_ci_states.setOnClickListener { _ -> startActivity(Intent(this, StateActivity::class.java)) }
        button_simple_motion_layout.setOnClickListener { _ -> startActivity(Intent(this, MotionLayoutActivity::class.java)) }
        button_motin_editor.setOnClickListener { _ -> startActivity(Intent(this, MotionEditorActivity::class.java)) }

    }
}