package com.b21cap0380.ezinventorymanagement.data

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class InventoryData(
    var productId: Int,
    var productName: String,
    var productQty: Int,
    var productUnit: String,
)
