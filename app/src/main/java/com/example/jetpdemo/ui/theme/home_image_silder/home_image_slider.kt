package com.example.jetpdemo.ui.theme.home_image_silder

import Dimens
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpdemo.R

@Composable
fun HomeImageSlider() {
    val scrollState = rememberScrollState() // Remember the scroll state
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(scrollState)
            .padding(
                horizontal = Dimens.padding10.dp,
            ),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        HomeScreenImageList(
            imageResId = R.drawable.ic_home_item_one,
        )
        HomeScreenImageList(
            imageResId = R.drawable.ic_home_item_two,
        )
        HomeScreenImageList(
            imageResId = R.drawable.ic_home_item_three,
        )
        HomeScreenImageList(
            imageResId = R.drawable.ic_home_item_four,
        )
    }

}

@Composable
fun HomeScreenImageList(imageResId: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .width(Dimens.padding280.dp)
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Dimens.padding180.dp),
            )
        }
    }
}
