package com.example.loginforabusereport

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_home_.*
import kotlinx.android.synthetic.main.fragment_home_.view.*
import kotlinx.android.synthetic.main.fragment_o_t_p_login.*
import kotlinx.android.synthetic.main.fragment_o_t_p_login.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_IT
// EM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home_Fragment : Fragment() {

    private lateinit var communicator: Communicator
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v=inflater.inflate(R.layout.fragment_home_, container, false)
        val button1=v.findViewById<Button>(R.id.btn_1)

      button1.setOnClickListener {
          val fragOTP=otp_page
          val manager= fragmentManager
          val frag_transaction= manager.beginTransaction()
          frag_transaction.replace(R.id.Home_Frag, fragOTP)
          frag_transaction.commit()


      }
        return v

    }


}





