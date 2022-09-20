package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var wishlist : ArrayList<wishlist>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.button)
        val urlInput = findViewById<EditText>(R.id.urlInput)
        val wishItem = urlInput.text.toString().uppercase()
        val itemName = findViewById<EditText>(R.id.itemName)
        val inputUrl = urlInput.text.toString().uppercase()






    }
}