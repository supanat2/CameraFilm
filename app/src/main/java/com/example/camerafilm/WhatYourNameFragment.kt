package com.example.camerafilm


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.camerafilm.databinding.FragmentWhatYourNameBinding
import java.util.jar.Attributes

/**
 * A simple [Fragment] subclass.
 */
class WhatYourNameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentWhatYourNameBinding>(inflater,
            R.layout.fragment_what_your_name,container,false)


        binding.submitButton.setOnClickListener{view: View ->
            view.findNavController().navigate(WhatYourNameFragmentDirections.actionWhatYourNameFragmentToMenu(binding.viewerNameText.text.toString()))
        }


        return binding.root
    }


}
