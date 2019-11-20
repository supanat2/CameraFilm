package com.example.camerafilm


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.camerafilm.databinding.FragmentMenuBinding

/**
 * A simple [Fragment] subclass.
 */
class Menu : Fragment() {
    private lateinit var name: Name
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMenuBinding>(inflater,
            R.layout.fragment_menu,container,false)

        val args = MenuArgs.fromBundle(arguments!!)
//        name.name = args.viewerName
        Log.i("safe",args.viewerName)
        name = Name(args.viewerName)
//        Log.i("safe", name.name + "in")
//    binding.nameText.setText(args.viewerName)


    binding.cameraButton.setOnClickListener{ view : View ->
        view.findNavController().navigate(R.id.action_menu_to_cameraListFragment)

    }
    binding.filmButton.setOnClickListener{ view : View ->

        view.findNavController().navigate(R.id.action_menu_to_filmFragment)

    }


        binding.name = name
        binding.invalidateAll()
        return binding.root
    }


}
