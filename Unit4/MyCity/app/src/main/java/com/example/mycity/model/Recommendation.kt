package com.example.mycity.model

import androidx.annotation.StringRes

data class Recommendation(
    var id: Int,
    @StringRes var nameId: Int,
    var score: Float,
    var price: String
)