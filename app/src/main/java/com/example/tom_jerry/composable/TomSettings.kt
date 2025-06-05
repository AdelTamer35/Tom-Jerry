package com.example.tom_jerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.ui.theme.IbmPlexSans
import com.example.tom_jerry.R

@Composable
fun TomSettings() {
    Column(
        modifier = Modifier.padding(top = 24.dp)
    ) {
        Text(
            text = "Tom Settings",
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
            fontFamily = IbmPlexSans,
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            textAlign = TextAlign.Right,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        TomSettingsOption(
            icon = painterResource(R.drawable.bed_icon),
            title = "Change sleeping place",
        )
        TomSettingsOption(
            icon = painterResource(R.drawable.cat_icon),
            title = "Meow settings",
        )
        TomSettingsOption(
            icon = painterResource(R.drawable.fridge_icon),
            title = "Password to open the fridge",
        )

    }

}

@Composable
fun TomSettingsOption(
    modifier: Modifier = Modifier,
    icon: Painter,
    title: String,
){
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
            text = title,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontFamily = IbmPlexSans,
            color = Color(0xFF1F1F1E).copy(alpha = 0.87f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TomSettingsPreview() {
    TomSettings()
}
