package com.b21cap0380.ezinventorymanagement.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b21cap0380.ezinventorymanagement.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}