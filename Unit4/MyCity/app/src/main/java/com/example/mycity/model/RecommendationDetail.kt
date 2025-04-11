package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecommendationDetail(
    val id: Int,
    @StringRes val nameId: Int,
    var score: Float,
    var price: String,
    @DrawableRes val imgId: Int,
    var address: String,
    var businessHours: String
)