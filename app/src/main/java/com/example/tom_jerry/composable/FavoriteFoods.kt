package com.example.tom_jerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.R
import com.example.tom_jerry.ui.theme.IbmPlexSans

@Composable
fun FavoriteFoods() {
    Column(
        modifier = Modifier.padding(top = 24.dp)
    ) {
        Text(
            text = "His favorite foods",
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
            fontFamily = IbmPlexSans,
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            textAlign = TextAlign.Right,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        TomFavoriteFoodsOption(
            icon = painterResource(R.drawable.alert_icon),
            foodName = "Mouses",
        )
        TomFavoriteFoodsOption(
            icon = painterResource(R.drawable.hamburger_icon),
            foodName = "Last stolen meal"
        )
        TomFavoriteFoodsOption(
            icon = painterResource(R.drawable.sleeping_icon),
            foodName = "Change sleep mood"
        )
    }
}

@Composable
fun TomFavoriteFoodsOption(
    modifier: Modifier = Modifier,
    icon: Painter,
    foodName: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(bottom = 12.dp)
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = icon,
                contentDescription = "Settings Icon",
                tint = Color.Unspecified,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = foodName,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontFamily = IbmPlexSans,
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteFoodsPreview() {
    FavoriteFoods()
}