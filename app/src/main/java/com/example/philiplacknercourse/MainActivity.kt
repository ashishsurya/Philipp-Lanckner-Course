package com.example.philiplacknercourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener {

            val name = etName.text.toString()
            val age = etAge.text.toString().toInt();
            val country = etCountry.text.toString()

            Intent(this,SecondActivity::class.java ).also {
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_AGE",age);
                it.putExtra("EXTRA_COUNTRY",country)
                startActivity(it)
            }
        }

    }




}