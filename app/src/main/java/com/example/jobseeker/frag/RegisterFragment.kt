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
import com.example.jobseeker.databinding.FragmentRegisterBinding
import com.example.jobseeker.model.Lmodel
import com.example.jobseeker.model.Rmodel
import com.example.jobseeker.viewmod.Authviewmodel
import kotlin.getValue


class RegisterFragment : Fragment() {

    lateinit var binding: FragmentRegisterBinding

    private val viewmodel: Authviewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRegisterBinding.inflate(inflater, container, false)


        user_regis_create()

        return binding.root


    }

    private fun user_regis_create() {

        with(binding) {

            regbtn.setOnClickListener {

                val namee = name.text.toString()

                val emaill = email.text.toString()

                val passw = pass.text.toString()

                if (namee.isNotEmpty()&&emaill.isNotEmpty() && passw.isNotEmpty()) {

                    val userdata = Rmodel(emaill, passw, "")

                    Toast.makeText(context, "$userdata", Toast.LENGTH_LONG).show()

                    viewmodel.registrationcreate(userdata)

                    findNavController().navigate(R.id.action_registerFragment_to_loginFragment)

                } else {

                    Toast.makeText(context, "please fillup all input box", Toast.LENGTH_LONG).show()

                }


            }


        }


    }

}
