package com.example.mymovies.screens.main

import android.icu.text.CaseMap
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberAsyncImagePainter
import com.example.mymovies.MediaItem
import com.example.mymovies.R
import com.example.mymovies.model.getMedia
import com.example.mymovies.screens.common.Thumb

@ExperimentalCoilApi
@Composable
fun MediaList(modifier: Modifier, onItemClick: Any, navController: NavHostController) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_xsmall)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_xsmall)),
        columns = GridCells.Adaptive(dimensionResource(R.dimen.padding_small))
    ) {
        items(getMedia()) { item ->
            MediaListItem(item, modifier = Modifier.padding(4.dp), navController = navController)
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun MediaListItem(
    mediaItem: MediaItem,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clickable { navController.navigate("detail/${mediaItem.id}") }
            .shadow(8.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(4.dp)
    ) {
        Column {
            Thumb(mediaItem)
        }
    }

}

@Composable
fun Title(mediaItem: MediaItem) {
    Text(text = mediaItem.title)
}



