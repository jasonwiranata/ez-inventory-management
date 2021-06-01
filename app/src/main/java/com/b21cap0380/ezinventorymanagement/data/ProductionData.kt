package com.b21cap0380.ezinventorymanagement.data

import com.google.firebase.database.IgnoreExtraProperties
import java.util.*

@IgnoreExtraProperties
data class ProductionData(
    var productionId: Int,
    var productionDate: Date,
    var materialName: String,
    var materialUsed: Int,
    var materialUnit: String,
    var productId: Int,
    var productName: String,
    var productQty: Int,
    var productUnit: String
)
