package com.example.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.lightColors
import androidx.compose.material3.MaterialTheme
import androidx.navigation.NavType
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import com.example.mymovies.screens.detail.DetailScreen
import com.example.mymovies.screens.main.MainScreen
import com.example.mymovies.ui.theme.MyMoviesTheme

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val type: Type
) {
    enum class Type { PHOTO, VIDEO }
}

@ExperimentalCoilApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyMoviesTheme {
                Navigation
            }


            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                composable("main") {
                    MainScreen(navController)
                }
                composable(
                    route = "detail/{mediaId}",
                    arguments = listOf(navArgument("mediaId") { type = NavType.IntType }
                    )
                ) { backStackEntry ->
                    val id = backStackEntry.arguments?.getInt("mediaId")
                    requireNotNull(id)
                    DetailScreen(id)
                }
            }
        }
    }
}












