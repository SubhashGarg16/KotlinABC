package com.example.loginforabusereport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home_.*
import kotlinx.android.synthetic.main.fragment_o_t_p_login.*

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentHome=Home_Fragment()
        supportFragmentManager.beginTransaction().add(R.id.Home_Frag, fragmentHome).commit()

        btn_1.setOnClickListener {
            val intent= Intent(this, OTPLogin::class.java)
        }
    }

    override fun passData(editText: String) {

        val transaction= this.supportFragmentManager.beginTransaction()
        val fragOTP=OTPLogin()
        transaction.replace(R.id.Home_Frag, fragOTP)
        transaction.commit()
    }


}