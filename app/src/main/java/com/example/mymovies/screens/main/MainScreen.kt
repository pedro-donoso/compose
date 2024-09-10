package com.example.mymovies.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi

@OptIn(ExperimentalCoilApi::class)
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        MainAppBar(
            onClickMenu = { /* Handle menu icon click */ },
            onClickSearch = { /* Handle search icon click */ },
            onClickShare = { /* Handle share icon click */ }
        )
        MediaList(modifier = Modifier.padding(horizontal = 16.dp))
    }
}