package com.example.mymovies.screens.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mymovies.MediaItem

@Composable
fun DetailScreen(navController: NavHostController, mediaId: Int) {
    // Assume you have a list of MediaItems
    val mediaItems: List<MediaItem> = listOf(/* your media items */)

    // Define the getMediaItem function
    fun getMediaItem(mediaId: Int): MediaItem? {
        return mediaItems.find { it.id == mediaId }
    }

    // Now you can use the getMediaItem function
    val mediaItem = getMediaItem(mediaId)
    if (mediaItem != null) {
        Text("Detalle de ${mediaItem.title}")
    } else {
        Text("No se encontró el elemento")
    }
}




