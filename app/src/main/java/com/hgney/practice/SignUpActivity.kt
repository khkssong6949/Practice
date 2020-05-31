package com.hgney.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        SsignupBtn.setOnClickListener {

            val content1 = SidEdit.text.toString()
            val content2 = SpwdEdit.text.toString()

            val myintent2 = Intent(this, MainActivity::class.java)

            myintent2.putExtra("signupID", content1)
            myintent2.putExtra("signupPWD", content2)

            startActivity(myintent2)
        }
    }
}

