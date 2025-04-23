package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.data.CategoriesDataProvider
import com.example.mycity.data.RecommendationDetailsDataProvider
import com.example.mycity.model.Category
import com.example.mycity.model.RecommendationDetail
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        MyCityUiState(
            currentCategory = CategoriesDataProvider.defaultCategory,
            currentRecommendation = RecommendationDetailsDataProvider.defaultRecommendationDetail
        )
    )

    val uiState: StateFlow<MyCityUiState> = _uiState

    fun updateCurrentCategory(selectedCategory: Category) {
        _uiState.update {
            it.copy(currentCategory = selectedCategory)
        }
    }

    fun updateCurrentRecommendation(selectedRecommendation: RecommendationDetail) {
        _uiState.update {
            it.copy(currentRecommendation = selectedRecommendation)
        }
    }

}

data class MyCityUiState(
    val currentCategory: Category = CategoriesDataProvider.defaultCategory,
    val currentRecommendation: RecommendationDetail = RecommendationDetailsDataProvider.defaultRecommendationDetail
)