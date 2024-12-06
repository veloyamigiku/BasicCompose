package com.example.cookingrecipes.model

import com.example.cookingrecipes.R

object RecipesDataSource {
    val recipes = listOf(
        Recipe(
            titleRes = R.string.recipe1_title,
            descriptionRes = R.string.recipe1_detail,
            imageRes = R.drawable.chocolate_mousse_cake
        )
    )
}