package com.b21cap0380.ezinventorymanagement.ui.production

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.b21cap0380.ezinventorymanagement.data.InventoryData
import com.b21cap0380.ezinventorymanagement.data.ProductionData
import com.b21cap0380.ezinventorymanagement.databinding.ActivityProductionBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class ProductionActivity : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase
    private lateinit var myProdRef :DatabaseReference
    private lateinit var myInvRef :DatabaseReference
    private var _binding: ActivityProductionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityProductionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = FirebaseDatabase.getInstance()
        myProdRef = database.getReference("production")
        myInvRef = database.getReference("inventory")
        binding.submitProduction.setOnClickListener {
            addProduction()
        }

    }

    private fun addProduction() {
        val productionId = binding.tiProductionId.text.toString()
        val productionDate = binding.tiProductionDate.text.toString()
        val materialName = binding.tiMaterialName.text.toString()
        val materialUsed = binding.tiMaterialUsed.text.toString().toInt()
        val materialUnit = binding.tiMaterialUnit.text.toString()
        val productionData = ProductionData(productionId, productionDate, materialName, materialUsed, materialUnit)
        val productId = binding.tiProductId.text.toString()
        val productName = binding.tiProductName.text.toString()
        val productQty = binding.tiProductQty.text.toString().toInt()
        val productUnit = binding.tiProductUnit.text.toString()
        val inventoryData = InventoryData(productId, productName, productQty, productUnit)
        val prodKey = myProdRef.push().key.toString()
        val invKey = myInvRef.push().key.toString()
        myProdRef.child(prodKey).setValue(productionData).addOnCompleteListener{
            Toast.makeText(this, "Production Input Success", Toast.LENGTH_SHORT).show()
            binding.tiProductionId.setText("")
            binding.tiProductionDate.setText("")
        }
        myInvRef.child(invKey).setValue(inventoryData).addOnCompleteListener{
            Toast.makeText(this, "Inventory Input Success", Toast.LENGTH_SHORT).show()
            binding.tiProductId.setText("")
            binding.tiProductName.setText("")
            binding.tiProductQty.setText("")
            binding.tiProductUnit.setText("")
        }
    }

}