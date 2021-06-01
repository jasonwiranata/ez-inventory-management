package com.b21cap0380.ezinventorymanagement.utils

import com.google.firebase.database.FirebaseDatabase


public class HelperClass {
    private var firebaseDatabase: FirebaseDatabase? = null
    fun getDatabase(): FirebaseDatabase? {
        if (firebaseDatabase == null) {
            firebaseDatabase = FirebaseDatabase.getInstance()
            firebaseDatabase!!.setPersistenceEnabled(true)
        }
        return firebaseDatabase
    }
}