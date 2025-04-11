package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.Recommendation

object RecommendationsDataProvider {

    private val categoryRecommendation = mapOf(
        Categories.CAFE.id to listOf(
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_CAFE_01.id,
                nameId = R.string.recommendation_name_cafe_01,
                score = 3.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_CAFE_02.id,
                nameId = R.string.recommendation_name_cafe_02,
                score = 3.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_CAFE_03.id,
                nameId = R.string.recommendation_name_cafe_03,
                score = 4.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_CAFE_04.id,
                nameId = R.string.recommendation_name_cafe_04,
                score = 4.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_CAFE_05.id,
                nameId = R.string.recommendation_name_cafe_05,
                score = 5.0F,
                price = "1000-2000"
            )
        ),
        Categories.PARK.id to listOf(
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_PARK_01.id,
                nameId = R.string.recommendation_name_park_01,
                score = 3.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_PARK_02.id,
                nameId = R.string.recommendation_name_park_02,
                score = 3.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_PARK_03.id,
                nameId = R.string.recommendation_name_park_03,
                score = 4.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_PARK_04.id,
                nameId = R.string.recommendation_name_park_04,
                score = 4.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_PARK_05.id,
                nameId = R.string.recommendation_name_park_05,
                score = 5.0F,
                price = "1000-2000"
            )
        ),
        Categories.RESTAURANT.id to listOf(
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_RESTAURANT_01.id,
                nameId = R.string.recommendation_name_restaurant_01,
                score = 3.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_RESTAURANT_02.id,
                nameId = R.string.recommendation_name_restaurant_02,
                score = 3.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_RESTAURANT_03.id,
                nameId = R.string.recommendation_name_restaurant_03,
                score = 4.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_RESTAURANT_04.id,
                nameId = R.string.recommendation_name_restaurant_04,
                score = 4.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_RESTAURANT_05.id,
                nameId = R.string.recommendation_name_restaurant_05,
                score = 5.0F,
                price = "1000-2000"
            )
        ),
        Categories.SHOPPING_CENTER.id to listOf(
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_01.id,
                nameId = R.string.recommendation_name_shopping_center_01,
                score = 3.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_02.id,
                nameId = R.string.recommendation_name_shopping_center_02,
                score = 3.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_03.id,
                nameId = R.string.recommendation_name_shopping_center_03,
                score = 4.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_04.id,
                nameId = R.string.recommendation_name_shopping_center_04,
                score = 4.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_05.id,
                nameId = R.string.recommendation_name_shopping_center_05,
                score = 5.0F,
                price = "1000-2000"
            )
        ),
        Categories.BRINGING_CHILDREN.id to listOf(
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_01.id,
                nameId = R.string.recommendation_name_bringing_children_01,
                score = 3.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_02.id,
                nameId = R.string.recommendation_name_bringing_children_02,
                score = 3.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_03.id,
                nameId = R.string.recommendation_name_bringing_children_03,
                score = 4.0F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_04.id,
                nameId = R.string.recommendation_name_bringing_children_04,
                score = 4.5F,
                price = "1000-2000"
            ),
            Recommendation(
                id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_05.id,
                nameId = R.string.recommendation_name_bringing_children_05,
                score = 5.0F,
                price = "1000-2000"
            )
        ),
    )

    fun getRecommendationsByCategoryId(categoryId: Int): List<Recommendation>? {
        return categoryRecommendation[categoryId]
    }
}