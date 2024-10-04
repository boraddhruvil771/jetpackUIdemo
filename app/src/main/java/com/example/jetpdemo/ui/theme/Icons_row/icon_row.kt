package com.example.jetpdemo.ui.components

import Dimens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpdemo.R

@Composable
fun IconsRow(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens.padding16.dp, vertical = Dimens.padding8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconWithText(
            icon = R.drawable.ic_gift_box_with,
            label = "Rewards",
            color = Color(0xFFFF4081),
            onClick = { navController.navigate("rewards") })
        IconWithText(
            icon = R.drawable.ic_discount,
            label = "Solutions",
            color = Color(0xFF6200EA),
            onClick = { navController.navigate("solutions") })
        IconWithText(
            icon = R.drawable.ic_flyer,
            label = "Brands",
            color = Color(0xFF00C853),
            onClick = { navController.navigate("brands") })
        IconWithText(
            icon = R.drawable.ic_gift_card,
            label = "Gift Card",
            color = Color(0xFFFF5722),
            onClick = { navController.navigate("account") })
    }

}

@Composable
fun IconWithText(icon: Int, label: String, color: Color, onClick: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(color)
                .clickable { onClick() }, contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = label,
                modifier = Modifier.size(Dimens.iconSize32.dp)
            )
        }
        Spacer(modifier = Modifier.height(Dimens.space4.dp))
        Text(text = label, style = MaterialTheme.typography.bodySmall)
    }
}
