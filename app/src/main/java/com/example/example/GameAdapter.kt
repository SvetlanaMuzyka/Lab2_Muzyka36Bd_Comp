package com.example.example

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.example.databinding.ItemBinding

class GameAdapter(
    val context: Context,
    val onClick: (model: Game, position: Int) -> Unit,
) : RecyclerView.Adapter<GameAdapter.GamesHolder>() {
    private val list = ArrayList<Game>()

    inner class GamesHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(game: Game, position: Int) {
            binding.tv1.text = game.name
            binding.tv2.text = game.Company
            Glide.with(context)
                .load(game.ResId)
                .into(binding.imageView)
            binding.info.setOnClickListener {
                onClick(game, position)
                val navController = binding.root.findNavController()
                val bundle = Bundle()
                bundle.putString("myTextView", game.Description)
                bundle.putString("myTextView2", game.name)
                navController.navigate(R.id.firstToSecond, bundle)
            }


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesHolder {
        val view = ItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return GamesHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GamesHolder, position: Int) {
        val game = list[position]
        holder.bindView(game, position)


    }

    fun setNewData(newList: List<Game>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()

    }
}