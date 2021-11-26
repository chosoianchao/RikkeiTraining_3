package com.rikkei.tranning.rikkeitraning3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var listModel: ArrayList<Model>? = null
    private var adapter: Adapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_model)
        listModel = ArrayList()
        addModel()
        adapter = Adapter(this, listModel!!)
        recyclerView?.adapter = adapter
        //recyclerView?.layoutManager = GridLayoutManager(this, 2)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        //recyclerView?.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.GAP_HANDLING_NONE )
    }

    private fun addModel() {
        listModel?.add(Model("Thor", R.drawable.ic_thor))
        listModel?.add(Model("Captain American", R.drawable.ic_cap))
        listModel?.add(Model("Captain Marvel", R.drawable.ic_captain_mavel))
        listModel?.add(Model("Iron Man", R.drawable.ic_ironman))
        listModel?.add(Model("Spider Man", R.drawable.ic_spider_man))
        listModel?.add(Model("Natasha", R.drawable.ic_natasha))
    }
}