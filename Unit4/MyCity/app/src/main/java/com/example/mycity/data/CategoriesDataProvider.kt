package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.Category

object CategoriesDataProvider {

    val allCategories = listOf<Category>(
        Category(
            id = Categories.CAFE.id,
            nameId = R.string.category_name_cafe,
            imgId = R.drawable.cafe_icon
        ),
        Category(
            id = Categories.PARK.id,
            nameId = R.string.category_name_park,
            imgId = R.drawable.park_icon
        ),
        Category(
            id = Categories.RESTAURANT.id,
            nameId = R.string.category_name_restaurant,
            imgId = R.drawable.restaurant_icon
        ),
        Category(
            id = Categories.SHOPPING_CENTER.id,
            nameId = R.string.category_name_shopping_center,
            imgId = R.drawable.shopping_center_icon
        ),
        Category(
            id = Categories.BRINGING_CHILDREN.id,
            nameId = R.string.category_name_bringing_children,
            imgId = R.drawable.bringing_children_icon
        ),
    )

    val defaultCategory = allCategories[0]

}
