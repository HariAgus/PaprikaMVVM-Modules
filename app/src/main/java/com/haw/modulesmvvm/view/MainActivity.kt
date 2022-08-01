package com.haw.modulesmvvm.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.haw.modulesmvvm.adapter.CoinAdapter
import com.haw.modulesmvvm.databinding.ActivityMainBinding
import com.haw.modulesmvvm.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var coinAdapter: CoinAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel.state.observe(this) { state ->
            if (!state.isLoading) {
                binding.progressBar.visibility = View.INVISIBLE
                if (state.error.isNotBlank()) {
                    binding.apply {
                        errorText.visibility = View.VISIBLE
                        errorText.text = state.error
                    }
                } else {
                    coinAdapter = CoinAdapter(state.coins)
                    binding.apply {
                        recyclerView.visibility = View.VISIBLE
                        recyclerView.adapter = coinAdapter
                    }
                }
            }
        }
    }

}