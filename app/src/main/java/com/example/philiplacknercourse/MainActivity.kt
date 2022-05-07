package com.example.philiplacknercourse

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    /*
    * STEP 1 : CREATE A NEW MENU RESOURCE FILE IN res FOLDER
    * STEP 2 : LINK THE NEWLY CREATED MENU RESOURCE FILE WITH ACTIVITY AND MENTION THE FUNCTIONALITY
    *
    * */

//  Assigning the newly created menu layout file to the Main Activity.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//    MENU INFLATING
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }


//    ASSINGIN FUNCTIONALITY FOR EACH OF THE TOOLBAR BUTTON
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miAddContact -> Toast.makeText(this,"You clicked on add contact",Toast.LENGTH_SHORT).show()
            R.id.miFavs -> Toast.makeText(this,"You clicked on Favourites",Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this,"You clicked on settings",Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
            R.id.miFeedback -> Toast.makeText(this,"You clicked on give feedback",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}