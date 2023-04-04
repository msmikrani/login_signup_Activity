package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {

   lateinit var username: EditText
   lateinit var password: EditText
    lateinit var forgotpassword:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       username=findViewById(R.id.usernameEtL)
       password=findViewById(R.id.paswordEtL)
        val btn=findViewById<Button>(R.id.btnLogin)
        val register=findViewById<TextView>(R.id.registerTv)
        forgotpassword = findViewById(R.id.forgot)

        register.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {

            val toast = Toast.makeText(this,"successful",Toast.LENGTH_SHORT).show()

            val bundle= Bundle()
            bundle.putString("username"!!,username.text.toString())
            bundle.putString("password"!!,password.text.toString())

            val intent= Intent(this,login_detail::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        forgotpassword.setOnClickListener {
            intent= Intent(this, com.example.loginregister.forgotpassword::class.java)
            startActivity(intent)
        }

    }
}