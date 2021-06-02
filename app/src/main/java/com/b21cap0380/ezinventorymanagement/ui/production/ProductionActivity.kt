package com.b21cap0380.ezinventorymanagement.ui.production

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.b21cap0380.ezinventorymanagement.data.InventoryData
import com.b21cap0380.ezinventorymanagement.data.ProductionData
import com.b21cap0380.ezinventorymanagement.databinding.ActivityProductionBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ProductionActivity : AppCompatActivity() {
    val database = Firebase.database
    val myRef = database.getReference("smart-arc-313102-default-rtdb")
    private var _binding: ActivityProductionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityProductionBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        val productId = binding.tiProductId.text.toString()
        val productName = binding.tiProductName.text.toString()
        val productQty = binding.tiProductQty.text.toString().toInt()
        val productUnit = binding.tiProductUnit.text.toString()
        val key = myRef.child("production").push().key
        if (key == null) {
            Log.w(TAG, "Couldn't get push key for posts")
            return
        }
        val production = ProductionData(productionId, productionDate, materialName, materialUsed, materialUnit)
        val productionValues = production.toMap()
        val childUpdates1 = hashMapOf<String, Any>("/production/$key" to productionValues)
        val inventory = InventoryData(productId, productName, productQty, productUnit)
        val inventoryValues = inventory.toMap()
        val childUpdates2 = hashMapOf<String, Any>("/inventory/$key" to inventoryValues)

        myRef.setValue("Hello")
        myRef.updateChildren(childUpdates1)
        myRef.updateChildren(childUpdates2)
        Toast.makeText(this, "SUBMIT SUCCESSFUL", Toast.LENGTH_SHORT).show()
    }
    companion object {
        private const val TAG = "ProductionActivity"
    }
}