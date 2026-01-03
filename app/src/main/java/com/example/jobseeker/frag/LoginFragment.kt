package com.example.jobseeker.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.jobseeker.R
import com.example.jobseeker.databinding.FragmentLoginBinding
import com.example.jobseeker.model.Lmodel
import com.example.jobseeker.viewmod.Authviewmodel


class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
     val viewmod: Authviewmodel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater,container,false)

        binding.login.setOnClickListener {

          binding.let {

              val emaill = it.email.text.toString()

              val passw = it.pass.text.toString()

              if (emaill.isEmpty()&&passw.isEmpty()){

                  Toast.makeText(context, "plz fillup all input box", Toast.LENGTH_LONG).show()

              }else{

                  val user = Lmodel(emaill,passw,"")

                  viewmod.logincreate(user)

              }
          }


        }


        return binding.root
    }


}