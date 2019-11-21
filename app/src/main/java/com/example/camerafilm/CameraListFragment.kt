package com.example.camerafilm


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.camerafilm.databinding.FragmentCameraListBinding
import com.example.camerafilm.databinding.FragmentWhatYourNameBinding

/**
 * A simple [Fragment] subclass.
 */
class CameraListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCameraListBinding>(inflater,
            R.layout.fragment_camera_list,container,false)


        binding.textSrt101.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_cameraListFragment_to_srt101)
        }
        binding.imgSrt101.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_cameraListFragment_to_srt101)
        }

        // Inflate the layout for this fragment

  //      return inflater.inflate(R.layout.fragment_camera_list, container, false)
        return binding.root
    }






}
