package com.davidgrajales.fragmentos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.davidgrajales.fragmentos.R
import kotlinx.android.synthetic.main.fragment_batman.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class BatmanFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_batman, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {


            button_second.setOnClickListener{
                findNavController().navigate(R.id.action_BatmanFragment_to_SupermanFragment)
            }
        }
    }
}