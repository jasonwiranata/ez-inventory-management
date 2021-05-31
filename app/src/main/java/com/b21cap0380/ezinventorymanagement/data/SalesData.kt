package com.b21cap0380.ezinventorymanagement.data

import java.util.*

data class SalesData(
    var salesId: Int,
    var salesDate: Date,
    var productId: Int,
    var productName: String,
    var productSold: Int,
    var productUnit: String
)
