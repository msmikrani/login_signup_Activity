package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class forgotpassword : AppCompatActivity() {
    lateinit var send:Button
    lateinit var emailsend:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)
        title= "Forgot Password"

        emailsend=findViewById(R.id.emailsend)
        send=findViewById(R.id.send)
        emailsend.toString()
        send.setOnClickListener {

            val toast=Toast.makeText(this,"Sendding OTP ${emailsend.text}",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,otpverify::class.java)
            startActivity(intent)

        }
    }
}