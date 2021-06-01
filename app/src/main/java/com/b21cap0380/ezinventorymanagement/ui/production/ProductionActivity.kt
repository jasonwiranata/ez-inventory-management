package com.b21cap0380.ezinventorymanagement.ui.production

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b21cap0380.ezinventorymanagement.BuildConfig
import com.b21cap0380.ezinventorymanagement.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ProductionActivity : AppCompatActivity() {
    val database = Firebase.database
    val myRef = database.getReference(BuildConfig.url)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_production)
    }
}