package com.example.tom_jerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun StateItem(
    modifier: Modifier = Modifier,
    icon: Painter,
    stateVale: String,
    stateLabel: String,
    stateBackgroundColor : Color
) {
    Card(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .background(stateBackgroundColor)
                .padding(horizontal = 11.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = icon,
                contentDescription = "State Icon",
                tint = Color.Unspecified,
                modifier = Modifier.padding(end = 10.dp)
            )
            Row(){
                Column {
                    Text(
                        text = stateVale,
                        fontSize = 16.sp,
                        fontFamily = IbmPlexSans,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF121212).copy(alpha = 0.6f),
                        letterSpacing = 1.sp,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = stateLabel,
                        fontSize = 12.sp,
                        fontFamily = IbmPlexSans,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF121212).copy(alpha = 0.37f),
                        letterSpacing = 1.sp,
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StateItemPreview() {
    StateItem(
        icon = painterResource(R.drawable.quarrels_stat_icon),
        stateVale = "2M 12K",
        stateLabel = "Quarrels State",
        stateBackgroundColor = Color(0xFFD0E5F0)
    )
}