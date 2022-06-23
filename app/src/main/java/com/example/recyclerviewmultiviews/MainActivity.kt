package com.example.recyclerviewmultiviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewmultiviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val _mainRecyclerViewAdapter: MainRecyclerViewAdapter = MainRecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.rvMain.setHasFixedSize(true)
        _binding.rvMain.layoutManager = LinearLayoutManager(this@MainActivity)
        _binding.rvMain.adapter = _mainRecyclerViewAdapter


        _mainRecyclerViewAdapter.setData(getDate())
    }

    //o certo é ter um viewModel que faz essa busca em um banco de dados
    //em um codigo real ele nao fica assim
    private fun getDate(): MutableList<MainRecyclerViewItem> {
        val lista = mutableListOf<MainRecyclerViewItem>()

        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(MainRecyclerViewItem.Ator("Saber 1", "Rei Arthur", R.drawable.saber))
        lista.add(MainRecyclerViewItem.Ator("Saber 2", "Rei Arthur", R.drawable.saber))
        lista.add(MainRecyclerViewItem.Ator("Saber 3", "Rei Arthur", R.drawable.saber))
        lista.add(MainRecyclerViewItem.Ator("Saber 4", "Rei Arthur", R.drawable.saber))
        lista.add(MainRecyclerViewItem.Ator("Saber 5", "Rei Arthur", R.drawable.saber))
        lista.add(MainRecyclerViewItem.Ator("Saber 6", "Rei Arthur", R.drawable.saber))
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))

        return lista
    }

}