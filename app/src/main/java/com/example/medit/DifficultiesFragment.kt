package com.example.medit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DifficultiesFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_difficulties, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_easy).setOnClickListener {
            findNavController().navigate(R.id.action_DifficultiesFragment_to_GameFragment)
        }

        view.findViewById<Button>(R.id.button_intermediate).setOnClickListener {
            findNavController().navigate(R.id.action_DifficultiesFragment_to_GameFragment)
        }

        view.findViewById<Button>(R.id.button_hard).setOnClickListener {
            findNavController().navigate(R.id.action_DifficultiesFragment_to_GameFragment)
        }
    }
}