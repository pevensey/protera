package com.example.prodi_itera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvProdi: RecyclerView
    private var list: ArrayList<Prodi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProdi = findViewById(R.id.rv_heroes)
        rvProdi.setHasFixedSize(true)

        list.addAll(Prodi_Data.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvProdi.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListProdiAdapter(list)
        rvProdi.adapter = listHeroAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                val intent = Intent(this, About::class.java)
                this@MainActivity.startActivity(intent)
            }
        }
    }
}