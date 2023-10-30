package com.example.hw3recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dataList: ArrayList<Data>
    private lateinit var dataAdapter: dataAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dataList = ArrayList()
        dataAdapter = dataAdapter(dataList)
        foodListItems()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = dataAdapter

    }

    private fun foodListItems() {
        dataList.add(Data("data1"))
        dataList.add(Data("data2"))
        dataList.add(Data("data3"))
        dataList.add(Data("data4"))
        dataList.add(Data("data5"))
        dataList.add(Data("data6"))
        dataList.add(Data("data8"))
        dataList.add(Data("data9"))
        dataList.add(Data("data10"))
        dataList.add(Data("data11"))
        dataList.add(Data("data12"))
        dataList.add(Data("data13"))

    }
}