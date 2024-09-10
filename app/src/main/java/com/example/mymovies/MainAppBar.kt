package com.example.mymovies

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable

@Composable
fun MainAppBar() {
    TopAppBar(
        titulo = "Mis Películas",
        icono = Icons.Default.PlayCircleOutline,
        onClickMenu = { /* Handle menu icon click */ },
        onClickSearch = { /* Handle search icon click */ },
        onClickShare = { /* Handle share icon click */ }
    )
}