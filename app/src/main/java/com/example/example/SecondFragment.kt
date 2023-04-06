package com.example.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.example.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    lateinit var binding: FragmentSecondBinding
    lateinit var adapter: GameAdapter
    val navController by lazy { findNavController() }
    private var gameName: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            gameName = it.getString("myTextView")
        }
        binding.textView.text = gameName

    }
}