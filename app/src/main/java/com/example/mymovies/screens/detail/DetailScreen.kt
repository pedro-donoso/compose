package com.example.mymovies.screens.detail

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
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

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailScreen(mediaId: Int) {
    val mediaItem = getMedia().find { it.id == mediaId }
    requireNotNull(mediaItem)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(mediaItem.title) },
                backgroundColor = Color.Blue,
                contentColor = Color.White

            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()

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
}




