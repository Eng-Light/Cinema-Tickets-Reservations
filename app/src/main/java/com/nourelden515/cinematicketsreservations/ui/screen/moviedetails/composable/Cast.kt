package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun Cast(
    castImages: List<String>,
) {
    LazyRow(contentPadding = PaddingValues(horizontal = 16.dp)) {
        itemsIndexed(castImages) { _, actorImage ->
            Image(
                painter = rememberAsyncImagePainter(actorImage),
                contentDescription = "",
                modifier = Modifier
                    .size(64.dp)
                    .padding(4.dp)
                    .clip(CircleShape),
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop
            )
        }
    }
}