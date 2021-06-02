package com.b21cap0380.ezinventorymanagement.data

import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class InventoryData(
    var productId: String? = "",
    var productName: String? = "",
    var productQty: Int = 0,
    var productUnit: String? = "",
){
    @Exclude
    fun toMap(): Map<String, Any?>{
        return mapOf(
            "productId" to productId,
            "productName" to productName,
            "productQty" to productQty,
            "productUnit" to productUnit
        )
    }
}
