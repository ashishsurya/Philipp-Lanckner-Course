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
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

/*
* LESSON ON HOW TO CREATE ALERT DIALOGS.
* TYPE 1 : A DIALOG WITH YES/NO RESPONSE.
* TYPE 2 : A DIALOG WERE USER SHOULD SELECT ONE OPTION FROM MANY AND ACCEPT THE DIALOG AND ALSO CAN DENY THE DIALOG WITHOUT CHOOSING.
* TYPE 3 : SAME AS TYPE2 BUT CAN SELECT MANY OPTIONS
*
*
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mr.Surya to your contacts list???")
            .setIcon(R.drawable.profile)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Mr.Surya to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "You didnt add Mr.Surya to your contact list",
                    Toast.LENGTH_SHORT
                ).show()

            }
            .create()


        btnD1.setOnClickListener {
            addContactDialog.show()
        }


        val options = arrayOf("First Item", "Second Item", "Third Item");
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options.")
            .setSingleChoiceItems(options, 0) { _, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the single choice dialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "You didn't accept the singe choice dialog",
                    Toast.LENGTH_SHORT
                ).show()

            }
            .create()

        btnD2.setOnClickListener {
            singleChoiceDialog.show()
        }


        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options.")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i, isChecked ->
                if (isChecked)
                    Toast.makeText(this, "You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "You unchecked ${options[i]}", Toast.LENGTH_SHORT).show()

            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the multi choice dialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "You didn't accept the multi choice dialog",
                    Toast.LENGTH_SHORT
                ).show()

            }
            .create()

        btnD3.setOnClickListener {
            multiChoiceDialog.show()
        }


    }


}