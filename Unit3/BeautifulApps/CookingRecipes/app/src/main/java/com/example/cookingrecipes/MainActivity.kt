package com.example.cookingrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cookingrecipes.model.Recipe
import com.example.cookingrecipes.model.RecipesDataSource
import com.example.cookingrecipes.ui.theme.CookingRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CookingRecipesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CookingRecipesApp()
                }
            }
        }
    }
}

@Composable
fun CookingRecipesApp() {
    Scaffold(
        topBar = {
            CookingRecipesTopAppBar()
        },
        modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(RecipesDataSource.recipes) {
                Recipe(
                    recipe = it,
                    modifier = Modifier.padding(10.dp))
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CookingRecipesTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically){
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge)
            }
        },
        modifier = modifier
    )
}

@Composable
fun Recipe(
    recipe: Recipe,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            )
            .clip(MaterialTheme.shapes.medium),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        onClick = { expanded = !expanded }
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = "レシピ." + recipe.index,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = stringResource(recipe.titleRes),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 15.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 15.dp),
                //.clip(MaterialTheme.shapes.medium),
                contentAlignment = Alignment.Center) {
                Image(
                    painterResource(recipe.imageRes),
                    contentDescription = stringResource(recipe.titleRes),
                    modifier = Modifier
                        .size(width = 350.dp, height = 180.dp)
                        .clip(MaterialTheme.shapes.medium),
                    contentScale = ContentScale.Crop
                )
            }
            if (expanded) {
                Text(
                    text = stringResource(recipe.descriptionRes),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipePreview() {
    CookingRecipesTheme {
        Recipe(RecipesDataSource.recipes[0])
    }
}

@Preview(showBackground = true)
@Composable
fun CookingRecipesPreview() {
    CookingRecipesTheme {
        CookingRecipesApp()
    }
}
