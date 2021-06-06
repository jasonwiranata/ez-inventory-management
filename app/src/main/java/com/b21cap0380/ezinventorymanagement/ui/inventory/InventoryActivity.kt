package com.b21cap0380.ezinventorymanagement.ui.inventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b21cap0380.ezinventorymanagement.databinding.ActivityInventoryBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class InventoryActivity : AppCompatActivity() {
    val database = Firebase.database
    val myRef = database.getReference("smart-arc-313102-default-rtdb")
    private var _binding: ActivityInventoryBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityInventoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}