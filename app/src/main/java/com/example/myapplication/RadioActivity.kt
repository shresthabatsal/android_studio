package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var apple : RadioButton
    lateinit var samsung : RadioButton
    lateinit var xiaomi : RadioButton
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        apple = findViewById(R.id.radioApple)
        samsung = findViewById(R.id.radioSamsung)
        xiaomi = findViewById(R.id.radioXiaomi)
        image = findViewById(R.id.imageView)

        apple.setOnClickListener {
            image.setImageResource(R.drawable.apple)
        }
        samsung.setOnClickListener{
            image.setImageResource(R.drawable.samsung)
        }
        xiaomi.setOnClickListener{
            image.setImageResource(R.drawable.xiaomi)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}