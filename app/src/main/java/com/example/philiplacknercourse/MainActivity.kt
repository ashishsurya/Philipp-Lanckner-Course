package com.example.philiplacknercourse

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

/*
* LESSON ON HOW TO CREATE SPINNERS(dropdowns with more options).
*
*
*
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        creating a list for our adapter view
        var todolist = mutableListOf(
            Todo("Hello",true),
            Todo("Enough go through your work", false)
        )

//      creating a new adapter class
        val adapter = TodoAdapter(todolist)

        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)


        btnAddTodo.setOnClickListener {
            val title = etNewTodo.text.toString()
            val todo = Todo(title, false)

            todolist.add(todo)

            adapter.notifyItemInserted(todolist.size - 1)

        }
    }


}