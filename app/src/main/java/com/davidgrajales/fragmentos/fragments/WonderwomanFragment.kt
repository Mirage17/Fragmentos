package com.davidgrajales.fragmentos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.davidgrajales.fragmentos.R
import kotlinx.android.synthetic.main.fragment_wonderwoman.*

class WonderwomanFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wonderwoman, container, false)
        b_wonderwoman.setOnClickListener {
            findNavController().navigate(R.id.action_wonderwomanFragment_to_flashFragment)
        }
    }


}