package com.example.pekerjaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvPekerjaan: RecyclerView
    private val list = ArrayList<Pekerjaan>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPekerjaan = findViewById(R.id.rv_pekerjaan)
        rvPekerjaan.setHasFixedSize(true)

        list.addAll(PekerjaanData.listData)
        showRecylerView()
    }

    private fun showRecylerView() {
        rvPekerjaan.layoutManager = LinearLayoutManager(this)
        val lisPekerjaanAdapter = PekerjaanAdapter(list)
        rvPekerjaan.adapter = lisPekerjaanAdapter
    }
}