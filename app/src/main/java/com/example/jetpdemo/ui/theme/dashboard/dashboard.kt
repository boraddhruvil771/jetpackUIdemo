package com.example.jetpdemo.ui.theme.dashboard

import Dimens
import HomeScreenSolution
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetpdemo.ui.components.HeaderSection
import com.example.jetpdemo.ui.components.IconsRow
import com.example.jetpdemo.ui.components.PointsSection
import com.example.jetpdemo.ui.components.VideoPlayerScreen
import com.example.jetpdemo.ui.theme.home_bottom_image.HomeBottomImage
import com.example.jetpdemo.ui.theme.home_image_silder.HomeImageSlider

@Composable
fun DashboardScreen(navController: NavHostController) {
    val scrollState = rememberScrollState() // Remember the scroll state
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Spacer(modifier = Modifier.height(Dimens.padding20.dp))
        HeaderSection()
        PointsSection()
        IconsRow(navController)
        VideoPlayerScreen("https://test-videos.co.uk/vids/bigbuckbunny/mp4/h264/1080/Big_Buck_Bunny_1080_10s_30MB.mp4")
        HomeImageSlider()
        HomeScreenSolution()
        HomeBottomImage()
    }
}
