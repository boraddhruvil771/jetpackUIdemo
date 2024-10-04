package com.example.jetpdemo.ui.components

import Dimens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpdemo.R

@Composable
fun PointsSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Dimens.padding16.dp)
            .clip(RoundedCornerShape(Dimens.padding8.dp))
            .background(Color(0xFFD50000))
    ) {
        Row(
            modifier = Modifier.padding(Dimens.padding16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Total Points",
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "2,584",
                    color = Color.White,
                    style = MaterialTheme.typography.headlineLarge
                )
                Text(
                    text = "100 Points Expiring in 3 Days",
                    color = Color.Yellow,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.width(Dimens.space8.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_qr_code),
                contentDescription = "Product Image",
            )
        }
    }
}
