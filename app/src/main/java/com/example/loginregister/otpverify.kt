package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class otpverify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpverify)

      val  btn=findViewById<Button>(R.id.btnverify)
        val resend =findViewById<TextView>(R.id.resend)

        btn.setOnClickListener {
            val toast= Toast.makeText(this,"Verify OTP",Toast.LENGTH_SHORT).show()

            val intent =Intent(this, Login::class.java)
            startActivity(intent)
        }
        resend.setOnClickListener {
            val toast=Toast.makeText(this,"Resend OTP Your Email",Toast.LENGTH_SHORT).show()
        }
    }

}