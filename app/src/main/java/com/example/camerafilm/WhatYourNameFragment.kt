package com.example.camerafilm


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
}
