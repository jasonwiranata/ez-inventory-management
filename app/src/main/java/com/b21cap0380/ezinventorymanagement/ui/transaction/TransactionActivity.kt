package com.b21cap0380.ezinventorymanagement.ui.transaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b21cap0380.ezinventorymanagement.databinding.ActivityTransactionBinding

class TransactionActivity : AppCompatActivity() {
    private var _binding: ActivityTransactionBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}