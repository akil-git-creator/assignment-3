package com.firstapp.bmi_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var weight: EditText = findViewById(R.id.input_weight)
        var height: EditText = findViewById(R.id.input_height)
        var button: Button = findViewById(R.id.button)
        var res: TextView = findViewById(R.id.result)

        button.setOnClickListener {
           val in_weight = weight.text.toString().toDoubleOrNull()
            val in_height = height.text.toString().toDoubleOrNull()
            if(in_height != null && in_weight != null){
                val result = in_weight/ in_height / in_height * 1000080
                val r = result.toString()
                res.setText(r)
            }
        }
    }
}