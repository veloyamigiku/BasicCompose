package com.example.cookingrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Greeting(
            name = "Android",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun Recipe(recipe: Recipe) {
    Column {
        Text(text = stringResource(recipe.titleRes))
        Box(modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(
                painterResource(recipe.imageRes),
                contentDescription = stringResource(recipe.titleRes),
                modifier = Modifier
                    .size(width = 300.dp, height = 180.dp),
                contentScale = ContentScale.Crop
            )
        }
        Text(text = stringResource(recipe.descriptionRes))
    }
}

@Preview(showBackground = true)
@Composable
fun RecipePreview() {
    Recipe(RecipesDataSource.recipes[0])
}

@Preview(showBackground = true)
@Composable
fun CookingRecipesPreview() {
    CookingRecipesTheme {
        CookingRecipesApp()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
