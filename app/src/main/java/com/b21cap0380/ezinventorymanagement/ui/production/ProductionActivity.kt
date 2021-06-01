package com.b21cap0380.ezinventorymanagement.ui.production

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b21cap0380.ezinventorymanagement.BuildConfig
import com.b21cap0380.ezinventorymanagement.databinding.ActivityProductionBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ProductionActivity : AppCompatActivity() {
    val database = Firebase.database
    val myRef = database.getReference(BuildConfig.url)

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
        var productionId = binding.tiProductionId.editText.toString()
        var productionDate = binding.tiProductionDate.editText.toString()
        var materialName = binding.tiMaterialName.editText.toString()
        var materialUsed = binding.tiMaterialUsed.editText.toString()
        var materialUnit = binding.tiMaterialUnit.editText.toString()
        var productId = binding.tiProductId.editText.toString()
        var productName = binding.tiProductName.editText.toString()
        var productQty = binding.tiProductQty.editText.toString()
        var productUnit = binding.tiProductUnit.editText.toString()
        myRef.child("production").child(productionId).setValue(productionId)
        myRef.child("production").child(productionDate).setValue(productionDate)
        myRef.child("production").child(materialName).setValue(materialName)
        myRef.child("production").child(materialUsed).setValue(materialUsed)
        myRef.child("production").child(materialUnit).setValue(materialUnit)
        myRef.child("production").child(productId).setValue(productId)
        myRef.child("production").child(productName).setValue(productName)
        myRef.child("production").child(productQty).setValue(productQty)
        myRef.child("production").child(productUnit).setValue(productUnit)
    }
}