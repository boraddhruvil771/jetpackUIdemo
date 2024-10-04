import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpdemo.R

@Composable
fun HomeScreenSolution() {
    val scrollState = rememberScrollState() // Remember the scroll state
    Box(modifier = Modifier.padding(0.dp)) {
        Row(
            modifier = Modifier.horizontalScroll(scrollState) // Make the Column scrollable
        ) {
            Box(modifier = Modifier.padding(8.dp))

            HomeProductCard(productName = "SHEETROCK TUFF-HIDE PRIMER-SURFACER",
                productDescription = "Achieve a level 5 drywall finish",
                imageResId = R.drawable.ic_solution_mac_two, // Replace with actual image resource
                backgroundColor = Color.White,
                onShareClick = { /* Share action */ },
                onFavoriteClick = { /* Favorite action */ })

            HomeProductCard(productName = "MAC PLASTER SPRAY-APPLIED FINISH",
                productDescription = "Specifically designed for monolithic acoustical ceiling",
                imageResId = R.drawable.ic_solution_sheetrock_three, // Replace with actual image resource
                backgroundColor = Color.White,
                onShareClick = { /* Share action */ },
                onFavoriteClick = { /* Favorite action */ })

            HomeProductCard(productName = "SHEETROCK ALL PURPOSE JOINT COMPOUND",
                productDescription = "Provides a professional grade performance",
                imageResId = R.drawable.ic_turf_solution_one, // Replace with actual image resource
                backgroundColor = Color.White,
                onShareClick = { /* Share action */ },
                onFavoriteClick = { /* Favorite action */ })

            HomeProductCard(productName = "SHEETROCK TUFF-HIDE PRIMER-SURFACER",
                productDescription = "Achieve a level 5 drywall finish",
                imageResId = R.drawable.ic_solution_mac_two, // Replace with actual image resource
                backgroundColor = Color.White,
                onShareClick = { /* Share action */ },
                onFavoriteClick = { /* Favorite action */ })
        }
    }
}

@Composable
fun HomeProductCard(
    productName: String,
    productDescription: String,
    imageResId: Int, // You can use a drawable resource for the image
    backgroundColor: Color,
    onShareClick: () -> Unit,
    onFavoriteClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(Dimens.padding8.dp),
        modifier = Modifier.padding(Dimens.padding8.dp)
    ) {
        Column(
            modifier = Modifier
                .width(280.dp) // Add padding inside the card for better layout
                .background(backgroundColor) // Set the background color
        ) {
            // Product Image
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens.padding150.dp),
                    contentScale = ContentScale.Crop // This will crop the image to fill the Box
                )
            }

            Spacer(modifier = Modifier.height(Dimens.space8.dp)) // Add some spacing between elements

            // Action Icons (Share, Favorite)
            Row(
                modifier = Modifier.fillMaxWidth() // Make row take full width
            ) {
                IconButton(onClick = onFavoriteClick) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite",
                        tint = Color.Gray
                    )
                }
                IconButton(onClick = onShareClick) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share",
                        tint = Color.Gray
                    )
                }
            }
        }
    }
}