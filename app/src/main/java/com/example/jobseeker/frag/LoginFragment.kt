package com.example.jobseeker.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.jobseeker.R
import com.example.jobseeker.databinding.FragmentLoginBinding
import com.example.jobseeker.model.Lmodel
import com.example.jobseeker.viewmod.Authviewmodel


class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater, container, false)


         logindatacreate()


        return binding.root
    }

    private fun logindatacreate() {

        with(binding){

            login.setOnClickListener {

                val emaill = email.text.toString()

                val pass = pass.text.toString()

                val userlogin = Lmodel(emaill,pass)

                



            }



        }



    }


}