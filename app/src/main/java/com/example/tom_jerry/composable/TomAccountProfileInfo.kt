package com.example.tom_jerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.R
import com.example.tom_jerry.ui.theme.IbmPlexSans

@Composable
fun TomAccountProfileInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.tom_account_profile),
            contentDescription = "Tom Account Profile",
            modifier = Modifier.padding(bottom = 4.dp).size(64.dp)
        )
        Text(
            text = "Tom",
            fontFamily = IbmPlexSans,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Text(
            text = "specializes in failure!",
            fontFamily = IbmPlexSans,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = Color.White.copy(alpha = 0.8f)
        )
        Row(
            modifier = Modifier
                .padding(top = 4.dp, start = 8.dp, end = 8.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(Color.White.copy(alpha = 0.12f)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Edit foolishness",
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
            )
        }

    }
}

@Preview(backgroundColor = 0xFF226993, showBackground = true)
@Composable
fun TomAccountProfileInfoPreview() {
    TomAccountProfileInfo()
}