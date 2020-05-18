package com.example.photed1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val MY_MASSAGE_KEY = "my-key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton.setOnClickListener {
            var intent = Intent(MainActivity@this, SecondActivity::class.java)
            intent.putExtra(MainActivity.MY_MASSAGE_KEY, "msg done 2")
            startActivity(intent)
        }
    }

}
