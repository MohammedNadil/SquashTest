package `in`.nadil.squashapps.ui.main

import `in`.nadil.squashapps.R
import `in`.nadil.squashapps.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: VideoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupbinding()
    }

    private fun setupbinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        setuprecycler()

    }

    private fun setuprecycler() {
        adapter = VideoAdapter()
        binding.videorecycler.adapter = adapter

        setupobservers()
    }

    private fun setupobservers() {
        viewModel.videolist.observe(this, {
            adapter.submitList(it)
        })

        viewModel.clickeditem.observe(this, {
            clicked(it)
        })
    }

    private fun clicked(it: Int?) {
        when (it) {
            1 -> {
                onBackPressed()
            }
        }
    }

}