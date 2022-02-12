package com.daggerhilt.mvvm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.daggerhilt.mvvm.adapter.CricketerAdapter
import com.daggerhilt.mvvm.databinding.ActivityMainBinding
import com.daggerhilt.mvvm.viewmodel.CricketerViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: CricketerViewModel by viewModels()
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        bindPlayersList()
    }

    private fun bindPlayersList() {
        viewModel.cricketerList.observe(this, Observer {
            viewBinding.recyclerView.layoutManager = LinearLayoutManager(this)
            viewBinding.recyclerView.adapter = CricketerAdapter(it)
        })
    }
}