package com.b21cap0380.ezinventorymanagement.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.b21cap0380.ezinventorymanagement.R
import com.b21cap0380.ezinventorymanagement.databinding.ActivityHomeBinding
import com.b21cap0380.ezinventorymanagement.ui.inventory.InventoryActivity
import com.b21cap0380.ezinventorymanagement.ui.login.LoginActivity
import com.b21cap0380.ezinventorymanagement.ui.production.ProductionActivity
import com.b21cap0380.ezinventorymanagement.ui.sales.SalesActivity
import com.b21cap0380.ezinventorymanagement.ui.transaction.TransactionActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.home){
            val hIntent = Intent(this, HomeActivity::class.java)
            startActivity(hIntent)
        }
        if(item.itemId == R.id.sign_out){
            Firebase.auth.signOut()
            val fIntent = Intent(this, LoginActivity::class.java)
            startActivity(fIntent)
            Toast.makeText(this, "LOGOUT SUCCESSFUL", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}