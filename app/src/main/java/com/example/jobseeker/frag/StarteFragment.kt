package com.example.jobseeker.frag

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jobseeker.R
import com.example.jobseeker.databinding.FragmentStarteBinding


class StarteFragment : Fragment() {

    lateinit var binding: FragmentStarteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentStarteBinding.inflate(inflater, container, false)

        binding.logIn.setOnClickListener {

            findNavController().navigate(R.id.action_starteFragment_to_loginFragment)

        }

        return binding.root
    }


}