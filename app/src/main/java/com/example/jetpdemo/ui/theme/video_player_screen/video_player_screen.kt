package com.example.jetpdemo.ui.components

import Dimens
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.PlayerView

@Composable
fun VideoPlayerScreen(videoUrl: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens.padding16.dp)
    ) {
        Box(modifier = Modifier.height(Dimens.padding230.dp)) {
            VideoPlayer(videoUrl = videoUrl)
        }
    }
}

@Composable
fun VideoPlayer(videoUrl: String) {
    // Create a reference for the player
    val context = LocalContext.current
    val player = remember { ExoPlayer.Builder(context).build() }

    // Prepare the media item
    val mediaItem = MediaItem.fromUri(videoUrl)
    player.setMediaItem(mediaItem)
    player.prepare()

    // Use AndroidView to display the PlayerView
    AndroidView(factory = { PlayerView(context).apply { this.player = player } },
        update = { playerView -> playerView.player = player })

    // Dispose the player when no longer needed
    DisposableEffect(Unit) {
        onDispose {
            player.release()
        }
    }
}
