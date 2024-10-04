import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun BrandsList() {
    val brands = listOf(
        "CELEBRETTO",
        "DONN",
        "DUROCK",
        "FIBEROCK",
        "QUADRA",
        "SECUROCK",
        "SHEETROCK",
        "SKYNEST",
        "SKYROCK",
        "SOLIDROCK",
        "TRANQUILLE"
    )

    // State to track the currently selected brand and whether the dialog is visible
    var showPopup by remember { mutableStateOf(false) }
    var selectedBrand by remember { mutableStateOf("") }

    Box(
        Modifier.padding(
            top = Dimens.padding32.dp,
            start = Dimens.padding8.dp,
            end = Dimens.padding8.dp,
            bottom = Dimens.padding100.dp
        )
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(Dimens.padding8.dp),
            horizontalArrangement = Arrangement.spacedBy(Dimens.padding8.dp),
        ) {
            items(brands) { brand ->
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.White, shape = RoundedCornerShape(Dimens.padding8.dp)
                    ) // White background with rounded corners
                    .border(
                        1.dp, Color.White, shape = RoundedCornerShape(Dimens.padding8.dp)
                    ) // Optional border
                    .padding(Dimens.padding16.dp) // Inner padding for content spacing
                    .clickable {
                        selectedBrand = brand
                        showPopup = true
                    } // Handle click event
                ) {
                    Text(
                        text = brand,
                        fontWeight = FontWeight.Bold,
                        fontSize = Dimens.fontSize16.sp,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.Center)

                    )
                }
            }
        }

        // Show the popup dialog if the state is true
        if (showPopup) {
            BrandPopup(brandName = selectedBrand, onClose = { showPopup = false })
        }
    }
}

@Composable
fun BrandPopup(brandName: String, onClose: () -> Unit) {
    Dialog(onDismissRequest = onClose) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens.padding16.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(Dimens.padding16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = brandName,
                    fontWeight = FontWeight.Bold,
                    fontSize = Dimens.fontSize20.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(Dimens.space16.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec a blandit enim. Nam bibendum...",
                    fontSize = Dimens.fontSize14.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(Dimens.padding32.dp))
                // Styled buttons based on your image reference
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // Close button with outline style
                    Box(
                        modifier = Modifier
                            .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable { onClose() }
                    ) {
                        Text(
                            text = "Close",
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    }

                    // Learn More button with filled style
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF956BFF), shape = RoundedCornerShape(8.dp)) // Using #956BFF for background
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable { /* Handle Learn More */ }
                    ) {
                        Text(
                            text = "Learn More",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}
