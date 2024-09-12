package com.example.mymovies.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun MainAppBar(
    onClickMenu: () -> Unit,
    onClickSearch: () -> Unit,
    onClickShare: () -> Unit
) {
    TopAppBar(
        titulo = "Mis Capturas",
        icono = Icons.Default.PlayCircleOutline,
        onClickMenu = onClickMenu,
        onClickSearch = onClickSearch,
        onClickShare = onClickShare
    )
}

@Composable
fun TopAppBar(
    titulo: String,
    icono: ImageVector,
    modifier: Modifier = Modifier,
    onClickMenu: () -> Unit,
    onClickSearch: () -> Unit,
    onClickShare: () -> Unit
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary,
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onClickMenu) { // Add a clickable menu icon
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    modifier = Modifier.size(24.dp),
                    tint = Color.White // White icon color
                )
            }
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
            Spacer(modifier = Modifier.weight(1f))
            Row {
                IconButton(onClick = onClickSearch) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }
                IconButton(onClick = onClickShare) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share",
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreenWithScaffold() {
    Scaffold(
        topBar = {
            MainAppBar(
                onClickMenu = { /* Handle menu icon click */ },
                onClickSearch = { /* Handle search icon click */ },
                onClickShare = { /* Handle share icon click */ }
            )
        },
        content = {
            // Tu contenido aquí
            Text("Contenido de la pantalla principal")
        }
    )
}