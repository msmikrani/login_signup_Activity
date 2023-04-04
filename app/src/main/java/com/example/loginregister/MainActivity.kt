package com.example.loginregister

import android.content.Context
import android.content.Intent
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var username:EditText
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var btn: Button
    lateinit var login :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        login=findViewById(R.id.loginTv)
        username=findViewById(R.id.usernameEtR)
        password=findViewById(R.id.passwordEtR)
        btn=findViewById(R.id.btnsignup)
        email=findViewById(R.id.emailEtR)

        login.setOnClickListener {
            val intent =Intent(this,Login()::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {

            val toast = Toast.makeText(this,"successful", Toast.LENGTH_SHORT).show()

            val bundle=Bundle()
            bundle.putString("username",username.text.toString())
            bundle.putString("email",email.text.toString())
            bundle.putString("password",password.text.toString())

            val intent=Intent(this,signup_Detail::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }




      

    }
}



