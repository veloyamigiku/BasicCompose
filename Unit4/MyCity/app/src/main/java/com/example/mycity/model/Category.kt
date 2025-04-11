package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Category(
    var id: Int,
    @StringRes var nameId: Int,
    @DrawableRes var imgId: Int
)