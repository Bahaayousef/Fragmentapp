package com.example.fragmentsapp

import android.app.ProgressDialog.show
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.Toast
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rateMeTextView = findViewById(R.id.rateMeTextView) as TextView

        rateMeTextView.setOnClickListener {
            val fragment = supportFragmentManager
            val dialog = Myfragment()
            dialog.show(fragment, "My Fragment")

        }

        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        val inflater = menuInflater
        inflater.inflate(R.menu.fragment_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 ->Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
            R.id.subitem1 -> Toast.makeText(this, "Sub-item 1 selected", Toast.LENGTH_SHORT).show()
        }
        return true;}






}





