package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.data.Categories
import com.example.mycity.data.CategoriesDataProvider
import com.example.mycity.data.RecommendationDetailsDataProvider
import com.example.mycity.data.RecommendationsDataProvider
import com.example.mycity.model.Category
import com.example.mycity.model.Recommendation
import com.example.mycity.model.RecommendationDetail
import com.example.mycity.ui.theme.MyCityTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityAppBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name)
            )
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = stringResource(R.string.back_button)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewMyCityAppBar() {
    MyCityTheme {
        MyCityAppBar()
    }
}

@Composable
private fun CategoriesListItem(
    category: Category
) {
    Card {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.category_item_inner_padding))
        ) {
            CategoriesListImageItem(
                category = category,
                modifier = Modifier
                    .padding(
                        start = dimensionResource(R.dimen.category_item_img_left_padding),
                        end = dimensionResource(R.dimen.category_item_img_right_padding))
            )
            Text(
                text = stringResource(category.nameId)
            )
        }
    }
}

@Composable
private fun CategoriesListImageItem(
    category: Category,
    modifier: Modifier
) {
    Image(
        painter = painterResource(category.imgId),
        contentDescription = null,
        modifier = modifier.size(dimensionResource(R.dimen.category_item_img_size))
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCategoriesListItem() {
    MyCityTheme {
        CategoriesListItem(
            category = CategoriesDataProvider.defaultCategory
        )
    }
}

@Composable
private fun CategoriesList(
    categories: List<Category>
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.category_item_vertical_spacing)
        )
    ) {
        items(items = categories, key = { category -> category.id }) { category ->
            CategoriesListItem(
                category = category
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCategoriesList() {
    MyCityTheme {
        CategoriesList(
            categories = CategoriesDataProvider.allCategories
        )
    }
}

@Composable
private fun RecommendationListItem(
    recommendation: Recommendation
) {
    Row {
        Column {
            Text(
                text = stringResource(recommendation.nameId),
                )
            Text(
                text = recommendation.score.toString()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecommendationListItem() {
    val recommendationList: List<Recommendation>? = RecommendationsDataProvider.getRecommendationsByCategoryId(Categories.CAFE.id)
    val recommendation: Recommendation = recommendationList!![0]
    MyCityTheme {
        RecommendationListItem(
            recommendation = recommendation
        )
    }
}

@Composable
private fun RecommendationList(
    recommendations: List<Recommendation>
) {
    LazyColumn {
        items(items = recommendations, key = { recommendation -> recommendation.id }) { recommendation ->
            RecommendationListItem(
                recommendation = recommendation
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecommendationList() {
    MyCityTheme {
        RecommendationList(
            recommendations = RecommendationsDataProvider.getRecommendationsByCategoryId(categoryId = Categories.CAFE.id)!!
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun RecommendationDetail(
    recommendationDetail: RecommendationDetail
) {
    Column {
        Image(
            painter = painterResource(recommendationDetail.imgId),
            contentDescription = null
        )
        Row {
            Text(
                text = stringResource(recommendationDetail.nameId)
            )
        }
        Row {
            Text(text = stringResource(R.string.recommendation_detail_address))
            Text(text = recommendationDetail.address)
        }
        Row {
            Text(text = stringResource(R.string.recommendation_detail_business_hours))
            Text(text = recommendationDetail.businessHours)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecommendationDetail() {
    MyCityTheme {
        RecommendationDetail(
            recommendationDetail = RecommendationDetailsDataProvider.defaultRecommendationDetail
        )
    }
}
