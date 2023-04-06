package com.example.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.example.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    lateinit var adapter: GameAdapter
    val navController by lazy { findNavController() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rw = requireActivity().findViewById<RecyclerView>(R.id.rw)

        adapter = GameAdapter(requireContext()) { game, position ->
            Toast.makeText(requireContext(), "${game.name}", Toast.LENGTH_SHORT).show()
//            Glide.with(requireContext())
//                .load(game.ResId)
//               .into(binding.imageView)
//            binding.info.setOnClickListener {
//                onClick(game, position)
//               val navController = binding.root.findNavController()
//               val bundle = Bundle()
//               bundle.putString("myTextView", game.Description)
//                navController.navigate(R.id.firstToSecond, bundle)
//
//
//           }


        }
        adapter.setNewData(createGames())
        rw.adapter = adapter
    }

//    private fun onClick(game: Game, position: Int) {
//
//    }


}