package com.example.mymovies

fun getMedia(): List<MediaItem> {
    return (1..10).map {
        MediaItem(
            id = it,
            title = "Title $it",
            thumb = "https://picsum.photos/400/400?random=$it",
            type = if (it % 3 == 0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO
        )
    }
}
