package com.javadsh98.constraintlayout_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_state_start.*

class StateActivity : AppCompatActivity() {

    var start = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_start)

        //describe all the layouts to constraint layout
        state_constraintlayout.loadLayoutDescription(R.xml.state_description)

        button_start.setOnClickListener { _ ->

            //set state after taping button
            state_constraintlayout.setState(R.id.loading, 0, 0)

            Handler().postDelayed({
                start = !start
                state_constraintlayout.setState(if(start) R.id.start else R.id.end, 0, 0)
            }, 3_000L)
        }

    }
}