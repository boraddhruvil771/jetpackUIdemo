package com.example.jetpdemo.ui.theme.my_account_page

import Dimens
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyAccountPage() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
            .verticalScroll(scrollState), // Enable scrolling

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Profile Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                // User Info
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Replace with an actual image in your implementation
                    // Image(painter = painterResource(id = R.drawable.profile_image), contentDescription = null)
                    Spacer(modifier = Modifier.size(64.dp)) // Placeholder for profile image
                    Column(modifier = Modifier.padding(start = Dimens.padding16.dp)) {
                        Text(text = "Jack Doy", fontSize = Dimens.fontSize18.sp)
                        Text(text = "+1 4543454466", fontSize = Dimens.fontSize14.sp)
                        Text(text = "jack.doy@gmail.com", fontSize = Dimens.fontSize14.sp)
                    }
                }
                Spacer(modifier = Modifier.height(Dimens.space8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(onClick = { /* TODO: Edit Profile Action */ }) {
                        Text("Edit Profile")
                    }
                    Button(onClick = { /* TODO: Change Password Action */ }) {
                        Text("Change Password")
                    }
                }
            }
        }

        // Account Options with different icons
        Spacer(modifier = Modifier.height(Dimens.padding16.dp))
        AccountOption(text = "Country", icon = Icons.Filled.MoreVert, value = "Kuwait")
        Spacer(modifier = Modifier.height(Dimens.padding8.dp))
        AccountOption(text = "Transactions", icon = Icons.Filled.Call)
        Spacer(modifier = Modifier.height(Dimens.padding8.dp))
        AccountOption(text = "Favorite Offers", icon = Icons.Filled.Favorite)
        Spacer(modifier = Modifier.height(Dimens.padding8.dp))
        AccountOption(text = "Dealers", icon = Icons.Filled.AccountBox)
        Spacer(modifier = Modifier.height(Dimens.padding8.dp))
        AccountOption(text = "Contact us", icon = Icons.Filled.Phone)
        Spacer(modifier = Modifier.height(Dimens.padding8.dp))
        AccountOption(text = "Terms & Conditions", icon = Icons.Filled.MailOutline)
        Spacer(modifier = Modifier.height(Dimens.padding8.dp))
        AccountOption(text = "Privacy Policy", icon = Icons.Filled.Face)

        Spacer(modifier = Modifier.height(Dimens.space24.dp))
        Button(
            onClick = { /* TODO: Delete My Account Action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text("Delete My Account", color = Color.White)
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { /* TODO: Logout Action */ }) {
            Text("Logout")
        }
    }
}


@Composable
fun AccountOption(text: String, icon: ImageVector, value: String? = null) {
    Card {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens.padding8.dp)
                .clickable { /* TODO: Handle Option Click */ },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box {
                    Icon(
                        imageVector = icon, // Passing the icon here
                        contentDescription = "$text Icon",
                        tint = Color.Red, // Adjust color as needed
                        modifier = Modifier.size(Dimens.padding24.dp) // Adjust size to your needs
                    )
                }
                Spacer(modifier = Modifier.width(Dimens.space4.dp)) // Space between icon and text
                Text(text = text, fontSize = Dimens.padding16.sp)
            }
            value?.let {
                Text(text = it, color = Color.Gray)
            }
        }
    }
}
