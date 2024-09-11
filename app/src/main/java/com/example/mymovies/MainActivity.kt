package com.example.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import com.example.mymovies.screens.detail.DetailScreen
import com.example.mymovies.screens.main.MainScreen

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












