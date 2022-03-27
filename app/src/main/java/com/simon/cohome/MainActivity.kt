package com.simon.cohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simon.cohome.pages.SignIn
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Sign in button listener
        signInButton.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
        }
    }
}