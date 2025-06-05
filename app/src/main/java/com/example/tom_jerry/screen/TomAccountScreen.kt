package com.example.tom_jerry.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.R
import com.example.tom_jerry.composable.FavoriteFoods
import com.example.tom_jerry.composable.StateItem
import com.example.tom_jerry.composable.TomAccountProfileInfo
import com.example.tom_jerry.composable.TomSettings
import com.example.tom_jerry.ui.theme.IbmPlexSans

@Composable
fun TomAccountScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEF4F6))
            .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.TopCenter,
    ) {

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(242.dp),
            painter = painterResource(R.drawable.tom_account_background),
            contentDescription = "Tom Account Background",
            contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            TomAccountProfileInfo()
        }

        Box(
            modifier = Modifier
                .padding(top = 166.dp)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .fillMaxSize()
                .background(Color(0xFFEEF4F6))
                .padding(vertical = 24.dp, horizontal = 16.dp),

            ) {
            Column(

            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    StateItem(
                        modifier = Modifier.weight(1f),
                        icon = painterResource(R.drawable.quarrels_stat_icon),
                        stateVale = "2M 12K",
                        stateLabel = "No. of quarrels",
                        stateBackgroundColor = Color(0xFFD0E5F0)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    StateItem(
                        modifier = Modifier.weight(1f),
                        icon = painterResource(R.drawable.workout_run_stat_icon),
                        stateVale = "+500 h",
                        stateLabel = "Chase time",
                        stateBackgroundColor = Color(0xFFDEEECD)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    StateItem(
                        modifier = Modifier.weight(1f),
                        icon = painterResource(R.drawable.sad_stat_icon_),
                        stateVale = "2M 12K",
                        stateLabel = "Hunting times",
                        stateBackgroundColor = Color(0xFFF2D9E7)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    StateItem(
                        modifier = Modifier.weight(1f),
                        icon = painterResource(R.drawable.heartbreak_stat_icon),
                        stateVale = "3M 7K",
                        stateLabel = "Heartbroken",
                        stateBackgroundColor = Color(0xFFFAEDCF)
                    )
                }
                TomSettings()
                FavoriteFoods()
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = "v.TomBeta",
                        fontFamily = IbmPlexSans,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = Color(0xFF121212).copy(alpha = 0.6f),
                    )
                }
            }
        }

    }
}

@Preview(
    showBackground = true,
//    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
)
@Composable
fun TomAccountScreenPreview() {
    TomAccountScreen()

}