package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnMessage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnMessage = findViewById(R.id.order_btn)

        btnMessage.setOnClickListener{
            Toast.makeText(this,"Order Placed Successfull", Toast.LENGTH_LONG).show()
        }
    }


}