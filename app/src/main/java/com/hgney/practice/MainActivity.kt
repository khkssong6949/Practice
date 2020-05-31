package com.hgney.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            var num = 10
            val idInput = idEdit.text.toString()
            val pwdInput = pwdEdit.text.toString()

            if(idInput=="admin" && pwdInput =="admin123")
            {
                Log.d("관리자 로그인",idInput)
                Toast.makeText(this,"관리자 로그인이 완료되었습니다.", Toast.LENGTH_SHORT).show()
            }
            else if (idInput=="hgney" && pwdInput == "hgney123")
            {
                Log.d("일반 사용자 로그인",idInput)
                Toast.makeText(this,"사용자 로그인이 완료되었습니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Log.d("로그인 실패.",idInput)
                Toast.makeText(this,"로그인에 실패하였습니다", Toast.LENGTH_SHORT).show()
            }

        }
    }
}