package com.example.nestrecyclerview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RawRes
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestrecyclerview.adapter.ParentHouseAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.StringWriter
import java.nio.file.Files
import java.nio.file.Paths

class MainActivity : AppCompatActivity() {

    private lateinit var parentHouseAdapter : ParentHouseAdapter
    val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initListener()
    }

    private fun initListener() {
        parentHouseAdapter.onItemClick = {
            Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
        }
    }


    private fun initView(){
        val recyclerView = findViewById<RecyclerView>(R.id.parent_rv)
        //get from mockup list
        //val list = getDataFromMock()

        //get from json file
        val list = getDataFromJson()
        //getDataFromJson()

        parentHouseAdapter = ParentHouseAdapter()
        parentHouseAdapter.addData(list)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = parentHouseAdapter
        }
    }

    private fun getDataFromMock() = GameOfThroneData.getData

    private fun getDataFromJson() = readRawJson<List<GameOfThrones>>(R.raw.data)

    private inline fun<reified T> readRawJson(@RawRes rawResId : Int): T{
        resources.openRawResource(rawResId).bufferedReader().use {
            return gson.fromJson<T>(it,object : TypeToken<T>() {}.type)
        }
    }

}