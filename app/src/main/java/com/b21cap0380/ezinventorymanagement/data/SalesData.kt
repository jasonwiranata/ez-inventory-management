package com.b21cap0380.ezinventorymanagement.data

import com.google.firebase.database.IgnoreExtraProperties
import java.util.*

@IgnoreExtraProperties
data class SalesData(
    var transactionId: Int,
    var transactionDate: Date,
    var productSold: Int,
)
