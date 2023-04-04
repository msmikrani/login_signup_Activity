package com.example.loginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class signup_Detail : AppCompatActivity() {

    lateinit var username:TextView
    lateinit var email:TextView
    lateinit var password:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_detail)

        username=findViewById(R.id.usernameSignup)
         email=findViewById(R.id.emailSignup)
         password=findViewById(R.id.passwoedSignup)

        val bundle=intent.extras
        if (bundle!=null){
            username.text="${bundle.getString("username")}"
            email.text="${bundle.getString("email")}"
            password.text="${bundle.getString("password")}"

        }

    }
}