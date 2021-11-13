package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {


    private lateinit var btnMessage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var checkBox: CheckBox = findViewById(R.id.checkbox)

        checkBox.setOnClickListener {
            Toast.makeText(this, "Hi there! Thank you for placing your order !!.", Toast.LENGTH_LONG).show()

            if (checkBox.isChecked()){
                Toast.makeText(this,"Order will be remembered",Toast.LENGTH_LONG).show();
            }
        }

       btnMessage = findViewById(R.id.order_btn)
        btnMessage.setOnClickListener {
            Toast.makeText(this, "Order Placed Successfull", Toast.LENGTH_LONG).show()
        }
    }
}