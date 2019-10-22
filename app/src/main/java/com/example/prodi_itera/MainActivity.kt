package com.example.prodi_itera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvProdi: RecyclerView
    private var list: ArrayList<Prodi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProdi = findViewById(R.id.rv_heroes);
        rvProdi.setHasFixedSize(true);

        list.addAll(Prodi_Data.listData);
        showRecyclerList();
    }

    private fun showRecyclerList() {
        rvProdi.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListProdiAdapter(list)
        rvProdi.adapter = listHeroAdapter
    }
}
