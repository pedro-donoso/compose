package com.example.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi
import com.example.mymovies.ui.MainAppBar
import com.example.mymovies.ui.MediaList
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
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesTheme {
                Scaffold(
                    topBar = { MainAppBar() }
                ) { padding ->
                    MediaList(modifier = Modifier.padding(padding))
                }
            }
        }
    }
}











