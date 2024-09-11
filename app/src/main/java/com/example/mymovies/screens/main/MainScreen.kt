package com.example.mymovies.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import com.example.mymovies.MediaItem

@OptIn(ExperimentalCoilApi::class)
@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        MainAppBar(
            onClickMenu = { /* Handle menu icon click */ },
            onClickSearch = { /* Handle search icon click */ },
            onClickShare = { /* Handle share icon click */ }
        )
        MediaList(
            modifier = Modifier.padding(horizontal = 16.dp),
            onItemClick = { mediaItem: MediaItem ->
                navController.navigate("detail/${mediaItem.id}")
            },
            navController = navController
        )
    }
}

