package com.example.tom_jerry.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.R
import com.example.tom_jerry.composable.TomCard
import com.example.tom_jerry.ui.theme.IbmPlexSans
import com.example.tom_jerry.ui.theme.JerryStoreBackground
import com.example.tom_jerry.ui.theme.PlaceholderFiled
import com.example.tom_jerry.ui.theme.PrimaryTextColor
import com.example.tom_jerry.ui.theme.SecondaryTextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JerryStoreScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(JerryStoreBackground)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
                .background(JerryStoreBackground)
        ) {
            Image(
                painter = painterResource(R.drawable.jerry_profile_image),
                contentDescription = "Jerry Profile Image",
                modifier = Modifier.size(48.dp)
            )
            Column(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.5.dp)
            ) {
                Text(
                    text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                    fontSize = 14.sp,
                    fontFamily = IbmPlexSans,
                    fontWeight = FontWeight.Medium,
                    color = PrimaryTextColor
                )
                Text(
                    text = "Which Tom do you want to buy?",
                    fontSize = 12.sp,
                    fontFamily = IbmPlexSans,
                    fontWeight = FontWeight.Normal,
                    color = SecondaryTextColor
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            BadgedBox(
                badge = {
                    Badge(
                        containerColor = Color(0xFF03578A),
                        contentColor = Color.White,
                        modifier = Modifier
                            .offset((-5).dp, (-3).dp)
                            .size(14.dp)

                    ) {
                        Text(
                            text = "3",
                            fontSize = 10.sp,
                            fontFamily = IbmPlexSans,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                }
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0x1F1F1F1F),
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.notification_icon),
                        contentDescription = "notification",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

//            NotificationBellIcon(3)
        }
        Row(
            modifier = Modifier
                .padding(vertical = 12.dp)
        ) {
            TextField(
                modifier = Modifier.weight(1f),
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Search about tom ...",
                        fontSize = 14.sp,
                        fontFamily = IbmPlexSans,
                        fontWeight = FontWeight.Normal,
                        color = PlaceholderFiled
                    )
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search_normal_icon),
                        contentDescription = "Search Icon",
                        modifier = Modifier.size(24.dp)
                    )
                },
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.White,
                    unfocusedIndicatorColor = Color.White
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
            FilledIconButton(
                onClick = { },
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = IconButtonDefaults.filledIconButtonColors(
                    containerColor = Color(0xFF03578A),
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.filter_icon),
                    contentDescription = "Filter Icon",
                    tint = Color.White
                )
            }
        }


        Box(
            contentAlignment = Alignment.TopEnd
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
                    .height(92.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(linearGradientBackground()),
            ) {
                Column(
                    modifier = Modifier.padding(top = 12.dp, start = 12.dp, bottom = 12.dp)
                ) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        fontSize = 16.sp,
                        fontFamily = IbmPlexSans,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold

                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = "Adopt Tom! (Free Fail-Free Guarantee)",
                        fontSize = 12.sp,
                        fontFamily = IbmPlexSans,
                        color = Color.White,
                        fontWeight = FontWeight.Normal,
                        softWrap = true
                    )
                }
//                Box(
//                    modifier =
//                    Modifier
//                        .clip(RoundedCornerShape(16.dp))
//                        .offset(x = 60.dp, y = (-10).dp)
//                        .rotate(135f)
//                        .fillMaxHeight()
//                        .fillMaxWidth()
//                        .scale(1.1f)
//                        .background(Color.White.copy(alpha = 0.04f), RoundedCornerShape(54.dp))
//                        .padding(8.dp)
//                        .background(Color.White.copy(alpha = 0.04f), RoundedCornerShape(54.dp)),
//                )
            }
            Image(
                painterResource(id = R.drawable.tom_banner),
                contentDescription = "Tom Banner",
                modifier = Modifier
                    .size(
                        width = 115.37560272216797.dp,
                        height = 108.dp
                    )
                    .offset(y = 8.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Cheap tom section",
                fontSize = 20.sp,
                fontFamily = IbmPlexSans,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryTextColor
            )
            Spacer(modifier = Modifier.weight(1f))
            TextButton(
                onClick = {},
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier.size(width = 60.dp, height = 18.dp)
            ) {
                Text(
                    text = "View all",
                    fontSize = 12.sp,
                    fontFamily = IbmPlexSans,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF03578A)
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Icon(
                    modifier = Modifier
                        .size(12.dp),
                    painter = painterResource(R.drawable.arrow_right_icon),
                    contentDescription = "Arrow Right",
                    tint = Color(0xFF03578A)
                )
            }
        }
        Column(
        ){
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                TomCard(
                    productName = "Sport Tom",
                    productDetails = "He runs 1 meter... trips over his boot.",
                    productPhoto = painterResource(R.drawable.sport_tom),
                    oldPrice = "5",
                    newPrice = "3",
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TomCard(
                    productName = "Tom the lover",
                    productDetails = "He loves one-sidedly... and is beaten by the other side.",
                    productPhoto = painterResource(R.drawable.tom_the_lover),
                    newPrice = "5",
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                TomCard(
                    productName = "Tom the bomb",
                    productDetails = "He blows himself up before Jerry can catch him.",
                    productPhoto = painterResource(R.drawable.tom_the_bomb),
                    newPrice = "10",
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TomCard(
                    productName = "Spy Tom",
                    productDetails = "Disguises itself as a table.",
                    productPhoto = painterResource(R.drawable.spy_tom),
                    newPrice = "12",
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                TomCard(
                    productName = "Frozen Tom",
                    productDetails = "He was chasing Jerry, he froze after the first look",
                    productPhoto = painterResource(R.drawable.frozen_tom),
                    newPrice = "10",
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TomCard(
                    productName = "Sleeping Tom",
                    productDetails = "He doesn't chase anyone, he just snores in stereo.",
                    productPhoto = painterResource(R.drawable.sleeping_tom),
                    newPrice = "10",
                    modifier = Modifier.weight(1f)
                )
            }
        }

    }
}

fun linearGradientBackground(): Brush {
    val startColor = Color(0xFF03446A)
    val endColor = Color(0xFF0685D0)


    val linearGradientBrush = linearGradient(
        colors = listOf(startColor, endColor)
    )
    return linearGradientBrush
}

@Preview(showBackground = true,
    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240",
//    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
)
@Composable
fun JerryStoreScreenPreview() {
    JerryStoreScreen()
}