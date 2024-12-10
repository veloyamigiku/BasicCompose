package com.example.cookingrecipes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    val index: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)