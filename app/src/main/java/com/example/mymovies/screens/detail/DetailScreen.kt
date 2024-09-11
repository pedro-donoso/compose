package com.example.mymovies.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberAsyncImagePainter
import com.example.mymovies.model.getMedia

//funciona
@Composable
fun DetailScreen(mediaId: Int) {
    val mediaItem = getMedia().find { it.id == mediaId }
    requireNotNull(mediaItem)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Image(
            painter = rememberAsyncImagePainter(model = mediaItem.thumb),
            contentDescription = mediaItem.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}




