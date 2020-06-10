package com.javadsh98.constraintlayout_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_cupcake.*

class CupcakeActivity : AppCompatActivity() {

    private var old = true

    var constraintSet1 = ConstraintSet()
    var constraintSet2 = ConstraintSet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        constraintSet2.clone(this, R.layout.activity_cupcake_second)// get constraint from layout

        setContentView(R.layout.activity_cupcake)

        constraintSet1.clone(cupcake_constraint_layout)// get constraint fro constraint layout

        //-----
        button_bake.setOnClickListener { _ ->
            TransitionManager.beginDelayedTransition(cupcake_constraint_layout)
            if(old) {
                constraintSet2.applyTo(cupcake_constraint_layout)
            }else{
                constraintSet1.applyTo(cupcake_constraint_layout)
            }
            old = !old
        }

    }
}