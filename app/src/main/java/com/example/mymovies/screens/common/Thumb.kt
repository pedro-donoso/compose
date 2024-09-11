package com.example.mymovies.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberAsyncImagePainter
import com.example.mymovies.MediaItem
import com.example.mymovies.R

@ExperimentalCoilApi
@Composable
fun Thumb(mediaItem: MediaItem, modifier: Modifier = Modifier) {
        Box(
            modifier = Modifier
                .height(dimensionResource(R.dimen.cell_thumb_height))
                .fillMaxWidth(),
        ) {
            Image(
                painter = rememberAsyncImagePainter(
                    model = mediaItem.thumb
                ),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            if (mediaItem.type == MediaItem.Type.VIDEO) {
                Icon(
                    Icons.Default.PlayCircleOutline,
                    contentDescription = null,
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.cell_play_icon_size))
                        .align(Alignment.Center),
                    tint = Color.White
                )
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.secondary)
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Text(
                text = mediaItem.title,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
