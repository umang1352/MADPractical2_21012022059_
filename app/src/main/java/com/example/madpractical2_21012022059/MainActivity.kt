package com.example.madpractical2_21012022059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    private val TAG ="MainActivity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "onCreate:Function Called ")
        Toast.makeText(this, "onCreate:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onCreate:Function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart:Function Called ")
        Toast.makeText(this, "onStart:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStart:Function Called",Snackbar.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume:Function Called ")
        Toast.makeText(this, "onResume:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onResume:Function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause:Function Called ")
        Toast.makeText(this, "onPause:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onPause:Function Called",Snackbar.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop:Function Called ")
        Toast.makeText(this, "onStop:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop:Function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy:Function Called ")
        Toast.makeText(this, "onDestroy:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy:Function Called",Snackbar.LENGTH_LONG).show()
    }
}