package com.b21cap0380.ezinventorymanagement.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.b21cap0380.ezinventorymanagement.databinding.ActivityHomeBinding
import com.b21cap0380.ezinventorymanagement.ui.inventory.InventoryActivity
import com.b21cap0380.ezinventorymanagement.ui.production.ProductionActivity
import com.b21cap0380.ezinventorymanagement.ui.sales.SalesActivity
import com.b21cap0380.ezinventorymanagement.ui.transaction.TransactionActivity

class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.productionBtn.setOnClickListener {
            val intent1 = Intent(this@HomeActivity, ProductionActivity::class.java)
            startActivity(intent1)
        }

        binding.salesBtn.setOnClickListener {
            val intent2 = Intent(this@HomeActivity, SalesActivity::class.java)
            startActivity(intent2)
        }

        binding.inventoryBtn.setOnClickListener {
            val intent3 = Intent(this@HomeActivity, InventoryActivity::class.java)
            startActivity(intent3)
        }

        binding.transactionBtn.setOnClickListener{
            val intent4 = Intent(this@HomeActivity, TransactionActivity::class.java)
            startActivity(intent4)
        }
    }
}