package com.b21cap0380.ezinventorymanagement

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.appcheck.FirebaseAppCheck
import com.google.firebase.appcheck.safetynet.SafetyNetAppCheckProviderFactory

class EZInventoryManagement: Application() {
    override fun onCreate() {
        FirebaseApp.initializeApp( this)
        val firebaseAppCheck = FirebaseAppCheck.getInstance()
        firebaseAppCheck.installAppCheckProviderFactory(
            SafetyNetAppCheckProviderFactory.getInstance())
        super.onCreate()
    }
}