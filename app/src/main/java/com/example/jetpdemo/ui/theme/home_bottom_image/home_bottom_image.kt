package com.example.jetpdemo.ui.theme.home_bottom_image

import Dimens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpdemo.R

@Composable
fun HomeBottomImage() {
    Box(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(R.drawable.ic_home_usg_me),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .width(Dimens.padding390.dp)
                .size(Dimens.space60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
    Spacer(modifier = Modifier.height(Dimens.padding100.dp))
}