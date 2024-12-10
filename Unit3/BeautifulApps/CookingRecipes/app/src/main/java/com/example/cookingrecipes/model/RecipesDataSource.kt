package com.example.cookingrecipes.model

import com.example.cookingrecipes.R

object RecipesDataSource {
    val recipes = listOf(
        Recipe(
            index = 1,
            titleRes = R.string.recipe1_title,
            descriptionRes = R.string.recipe1_detail,
            imageRes = R.drawable.chocolate_mousse_cake
        ),
        Recipe(
            index = 2,
            titleRes = R.string.recipe2_title,
            descriptionRes = R.string.recipe2_detail,
            imageRes = R.drawable.cafe_latte_pudding
        ),
        Recipe(
            index = 3,
            titleRes = R.string.recipe3_title,
            descriptionRes = R.string.recipe3_detail,
            imageRes = R.drawable.new_york_cheesecake
        ),
        Recipe(
            index = 4,
            titleRes = R.string.recipe4_title,
            descriptionRes = R.string.recipe4_detail,
            imageRes = R.drawable.yogurt_pudding
        ),
        Recipe(
            index = 5,
            titleRes = R.string.recipe5_title,
            descriptionRes = R.string.recipe5_detail,
            imageRes = R.drawable.panna_cotta
        ),
        Recipe(
            index = 6,
            titleRes = R.string.recipe6_title,
            descriptionRes = R.string.recipe6_detail,
            imageRes = R.drawable.matcha_pudding
        ),
        Recipe(
            index = 7,
            titleRes = R.string.recipe7_title,
            descriptionRes = R.string.recipe7_detail,
            imageRes = R.drawable.yogurt_tiramisu
        ),
        Recipe(
            index = 8,
            titleRes = R.string.recipe8_title,
            descriptionRes = R.string.recipe8_detail,
            imageRes = R.drawable.lemon_rare_cheesecake
        ),
        Recipe(
            index = 9,
            titleRes = R.string.recipe9_title,
            descriptionRes = R.string.recipe9_detail,
            imageRes = R.drawable.blueberry_rare_cheese
        ),
        Recipe(
            index = 10,
            titleRes = R.string.recipe10_title,
            descriptionRes = R.string.recipe10_detail,
            imageRes = R.drawable.egg_steamed_bread
        )
    )
}