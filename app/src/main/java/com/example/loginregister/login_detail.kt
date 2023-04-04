package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login_detail : AppCompatActivity() {


   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_detail)

        val username = findViewById<TextView>(R.id.UsernameTv)
        val password = findViewById<TextView>(R.id.Password)



        val bundle = intent.extras
        if (bundle!= null){
            username.text="${bundle.getString("username")}"
            password.text="${bundle.getString("password")}"
        }


    }

}