package com.example.medit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class GameFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //tips
        view.findViewById<Button>(R.id.button5).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_difficultiesFragment) //TODO FIX_ME
        }

        //skip
        view.findViewById<Button>(R.id.button6).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_rulesFragment) //TODO FIX_ME
        }
    }
}