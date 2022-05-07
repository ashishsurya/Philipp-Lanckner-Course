package com.example.philiplacknercourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener{
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            val onions = cbOnions.isChecked;
            val salad = cbSalad.isChecked;

            val orderString = "You ordered a burger with\n" +
                    "${meat.text.toString()}\n" +
                    "${if(onions) "Onions" else ""}\n" +
                    "${if(salad) "Salad" else ""}"


            tvFinalOrder.text = orderString;
        }

    }




}