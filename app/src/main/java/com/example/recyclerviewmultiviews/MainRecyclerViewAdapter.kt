package com.example.recyclerviewmultiviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewmultiviews.databinding.ResAtorBinding
import com.example.recyclerviewmultiviews.databinding.ResCabecalhoBinding

class MainRecyclerViewAdapter : RecyclerView.Adapter<MainRecyclerViewHolder>() {

    private var list = mutableListOf<MainRecyclerViewItem>()

    fun setData(lista : MutableList<MainRecyclerViewItem>){
        this.list = lista
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder  =
             when(viewType){
            TIPO_ATOR -> MainRecyclerViewHolder.AtorViewHolder(
                ResAtorBinding.inflate(LayoutInflater.from(parent.context))
            )
            TIPO_CABECALHO -> MainRecyclerViewHolder.CabecalhoViewHolder(
                ResCabecalhoBinding.inflate(LayoutInflater.from(parent.context))
            )
            else -> throw IllegalArgumentException("error in view")
        }


    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) =
        when(holder){
            is MainRecyclerViewHolder.AtorViewHolder -> holder.bind(list[position] as MainRecyclerViewItem.Ator)
            is MainRecyclerViewHolder.CabecalhoViewHolder -> holder.bind(list[position] as MainRecyclerViewItem.Cabecalho)
        }


    override fun getItemViewType(position: Int): Int = when (list[position]){
            is MainRecyclerViewItem.Ator -> TIPO_ATOR
            is MainRecyclerViewItem.Cabecalho -> TIPO_CABECALHO
        }


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    companion object {
        const val TIPO_ATOR = 0
        const val TIPO_CABECALHO = 1
    }
}