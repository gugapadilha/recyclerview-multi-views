package com.example.recyclerviewmultiviews

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.recyclerviewmultiviews.databinding.ActivityMainBinding
import com.example.recyclerviewmultiviews.databinding.ResAtorBinding
import com.example.recyclerviewmultiviews.databinding.ResCabecalhoBinding

sealed class MainRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class CabecalhoViewHolder(
        private val _binding : ResCabecalhoBinding
    ) : MainRecyclerViewHolder(_binding){

        fun bind(cabecalho : MainRecyclerViewItem.Cabecalho){
            _binding.imgHeader.setImageResource(cabecalho.image)
        }
    }

    class AtorViewHolder(
        private val _binding : ResAtorBinding
    ) : MainRecyclerViewHolder(_binding){

        fun bind(ator: MainRecyclerViewItem.Ator){
            _binding.tvAtor.text = ator.nome
            _binding.tvAtorPapel.text = ator.papel
            _binding.imgAtor.setImageResource(ator.image)
        }
    }
}