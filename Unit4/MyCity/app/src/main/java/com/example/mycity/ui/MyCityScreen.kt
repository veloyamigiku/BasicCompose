package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycity.R
import com.example.mycity.data.Categories
import com.example.mycity.data.CategoriesDataProvider
import com.example.mycity.data.RecommendationDetailsDataProvider
import com.example.mycity.data.RecommendationsDataProvider
import com.example.mycity.model.Category
import com.example.mycity.model.Recommendation
import com.example.mycity.model.RecommendationDetail
import com.example.mycity.ui.theme.MyCityTheme
import com.example.mycity.ui.utils.MyCityContentType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MyCityAppBar() {
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
private fun PreviewMyCityAppBar() {
    MyCityTheme {
        MyCityAppBar()
    }
}

@Composable
private fun CategoriesListHeaderItem() {
    Card(
        colors = CardDefaults.cardColors(
            //containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
       Row(
           verticalAlignment = Alignment.CenterVertically,
           modifier = Modifier
               .fillMaxWidth()
               .padding(dimensionResource(R.dimen.category_header_item_inner_padding))
       ) {
           Text(
               text = "Category"
           )
       }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCategoriesListHeaderItem() {
    MyCityTheme {
        CategoriesListHeaderItem()
    }
}

@Composable
private fun CategoriesListItem(
    category: Category
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
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
private fun PreviewCategoriesListItem() {
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
private fun PreviewCategoriesList() {
    MyCityTheme {
        CategoriesList(
            categories = CategoriesDataProvider.allCategories
        )
    }
}

@Composable
private fun RecommendationListHeaderItem(
    categoryName: String
) {
    Card(
        colors = CardDefaults.cardColors(
            //containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.category_header_item_inner_padding))
        ) {
            Text(
                text = categoryName
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecommendationListHeaderItem() {
    MyCityTheme {
        RecommendationListHeaderItem(
            categoryName = stringResource(CategoriesDataProvider.defaultCategory.nameId)
        )
    }
}

@Composable
private fun RecommendationListItem(
    recommendation: Recommendation
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.recommendation_item_inner_padding))
        ) {
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
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecommendationListItem() {
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
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.recommendation_item_vertical_spacing)
        )
    ) {
        items(items = recommendations, key = { recommendation -> recommendation.id }) { recommendation ->
            RecommendationListItem(
                recommendation = recommendation
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecommendationList() {
    MyCityTheme {
        RecommendationList(
            recommendations = RecommendationsDataProvider.getRecommendationsByCategoryId(categoryId = Categories.CAFE.id)!!
        )
    }
}

@Composable
private fun RecommendationDetailTopBar(
    onBackButtonClicked: () -> Unit,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = onBackButtonClicked,
            modifier = Modifier
                .padding(horizontal = dimensionResource(id = R.dimen.recommendation_detail_top_bar_back_button_padding_horizontal))
                .background(MaterialTheme.colorScheme.surface, shape = CircleShape)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = stringResource(id = R.string.back_button)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = dimensionResource(R.dimen.recommendation_detail_name_padding_end))
        ) {
            Text(
                text = stringResource(myCityUiState.currentRecommendation.nameId),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecommendationDetailTopBar() {
    MyCityTheme {
        RecommendationDetailTopBar(
            onBackButtonClicked = {},
            myCityUiState = MyCityUiState()
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun RecommendationDetailCard(
    recommendationDetail: RecommendationDetail
) {
    Card {
        Column {
            Image(
                painter = painterResource(recommendationDetail.imgId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(dimensionResource(R.dimen.recommendation_detail_content_padding))
            ) {
                Row {
                    Text(
                        text = stringResource(recommendationDetail.nameId)
                    )
                }
                Row {
                    Text(
                        text = stringResource(R.string.recommendation_detail_address),
                        modifier = Modifier.width(dimensionResource(R.dimen.recommendation_detail_content_item_name_width))
                    )
                    Text(text = recommendationDetail.address)
                }
                Row {
                    Text(
                        text = stringResource(R.string.recommendation_detail_business_hours),
                        modifier = Modifier.width(dimensionResource(R.dimen.recommendation_detail_content_item_name_width))
                    )
                    Text(text = recommendationDetail.businessHours)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecommendationDetailCard() {
    MyCityTheme {
        RecommendationDetailCard(
            recommendationDetail = RecommendationDetailsDataProvider.defaultRecommendationDetail
        )
    }
}

@Composable
private fun RecommendationDetail(
    myCityUiState: MyCityUiState,
    onBackPressed: () -> Unit,
    isFullscreen: Boolean = false
) {
    Box {
        LazyColumn {
            item {
                if (isFullscreen) {
                    RecommendationDetailTopBar(
                        onBackButtonClicked = onBackPressed,
                        myCityUiState = myCityUiState,
                        modifier = Modifier
                            .padding(
                                bottom = dimensionResource(R.dimen.recommendation_detail_top_bar_padding_bottom),
                                top = dimensionResource(R.dimen.recommendation_detail_top_bar_padding_vertical)
                            )
                    )
                }
                RecommendationDetailCard(
                    recommendationDetail = myCityUiState.currentRecommendation
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecommendationDetail() {
    MyCityTheme {
        RecommendationDetail(
            myCityUiState = MyCityUiState(),
            onBackPressed = {},
            isFullscreen = true
        )
    }
}

@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val viewModel: MyCityViewModel = viewModel()
    val myCityUiState = viewModel.uiState.collectAsState().value
    val contentType: MyCityContentType = when (windowSize) {
        WindowWidthSizeClass.Compact -> {
            MyCityContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Medium -> {
            MyCityContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Expanded -> {
            MyCityContentType.LIST_AND_DETAIL
        }
        else -> {
            MyCityContentType.LIST_ONLY
        }
    }
    MyCityScreen(
        contentType = contentType,
        myCityUiState = myCityUiState
    )
}

@Composable
private fun MyCityScreen(
    contentType: MyCityContentType,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier) {


}