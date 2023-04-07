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
    private var gameDesc: String? = null
    private var gameName: String? = null
    private var gameDateR: String? = null
    private var gameGen: String? = null
    private var gameCompany: String? = null
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
            gameDesc = it.getString("Description")
            gameName = it.getString("Name")
            gameDateR = it.getString("DateOfRelease")
            gameGen = it.getString("Genre")
            gameCompany = it.getString("Company")
        }

        binding.gamedes.text = gameDesc
        binding.gn.text = gameName
        binding.gcompany.text = gameCompany
        binding.gdrelease.text = gameDateR
        binding.gameGenre.text = gameGen


    }
}