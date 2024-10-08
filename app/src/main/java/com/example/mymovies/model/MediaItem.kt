package com.example.mymovies.model

import com.example.mymovies.MediaItem

fun getMedia(): List<MediaItem> {
    return (1..18).map {
        MediaItem(
            id = it,
            title = "Archivo $it",
            thumb = "https://picsum.photos/400/400?random=$it",
            type = if (it % 3 == 0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO
        )
    }
}
