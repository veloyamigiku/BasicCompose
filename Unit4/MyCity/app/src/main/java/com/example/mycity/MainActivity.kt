package com.example.mycity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycity.ui.MyCityApp
import com.example.mycity.ui.theme.MyCityTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MyCityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val windowSize = calculateWindowSizeClass(this)
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    MyCityApp(
                        windowSize = windowSize.widthSizeClass,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCityTheme {
        Greeting("Android")
    }
}
*/
@Preview(showBackground = true)
@Composable
fun MyCityAppCompactPreview() {
    MyCityTheme {
        Surface {
            MyCityApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyCityAppMediumPreview() {
    MyCityTheme {
        Surface {
            MyCityApp(
                windowSize = WindowWidthSizeClass.Medium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyCityAppExpandedPreview() {
    MyCityTheme {
        Surface {
            MyCityApp(
                windowSize = WindowWidthSizeClass.Expanded
            )
        }
    }
}