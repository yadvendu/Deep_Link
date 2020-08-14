package com.example.deeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t2 = findViewById<TextView>(R.id.text2);
        t2.setMovementMethod(LinkMovementMethod.getInstance())
    }
}
