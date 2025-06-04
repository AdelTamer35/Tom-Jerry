package com.example.tom_jerry.screen

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.R
import com.example.tom_jerry.composable.CardDetails
import com.example.tom_jerry.composable.PreparationMethodDetails
import com.example.tom_jerry.ui.theme.IbmPlexSans
import com.example.tom_jerry.ui.theme.PrimaryTextColor
import com.example.tom_jerry.ui.theme.TomKitchenBackGround

@SuppressLint("InvalidColorHexValue")
@Composable
fun TomKitchenScreen() {
    Box(
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawBehind {
                    drawRect(
                        size = size.copy(height = 400.dp.toPx()), color = TomKitchenBackGround
                    )
                }
                .verticalScroll(rememberScrollState())
        ) {

            Image(
                painter = painterResource(R.drawable.ellipse),
                contentDescription = "Ellipse Shape",
            )
            ////////////////////////////////////////////////
            Box(
                modifier = Modifier
                    .padding(vertical = 18.dp)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)
                ) {
                    Row() {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 8.dp),
                            painter = painterResource(R.drawable.ruler_icon),
                            contentDescription = "Ruler Icon",
                            tint = Color.White,
                        )
                        Text(
                            text = "High tension",
                            fontFamily = IbmPlexSans,
                            letterSpacing = 1.sp,
                            fontSize = 16.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row() {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 8.dp),
                            painter = painterResource(R.drawable.chef_icon),
                            contentDescription = "Ruler Icon",
                            tint = Color.White,
                        )
                        Text(
                            text = "Shocking foods",
                            fontFamily = IbmPlexSans,
                            letterSpacing = 1.sp,
                            fontSize = 16.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
            ////////////////////////////////////////////////

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 162.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFFEEF4F6)),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp, vertical = 32.dp)
                ) {
                    ///////////////////// Meal Details///////////////////////////
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //////////////////// Electric Pasta Info ////////////////////////////
                        Row {
                            Text(
                                text = "Electric Tom pasta",
                                fontFamily = IbmPlexSans,
                                fontSize = 20.sp,
                                color = PrimaryTextColor,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.favorite_icon),
                                contentDescription = "Favorite Icon",
                                tint = Color(0xFF03578A)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .size(width = 91.dp, height = 30.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFFD0E5F0)),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.money_bag),
                                contentDescription = "Bag Money Icon",
                                tint = Color(0xFF03578A),
                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = "5 cheeses",
                                fontFamily = IbmPlexSans,
                                fontSize = 12.sp,
                                color = Color(0xFF03578A),
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Row(
                            modifier = Modifier.padding(top = 8.dp)
                        ) {
                            Text(
                                text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                                fontFamily = IbmPlexSans,
                                fontSize = 14.sp,
                                color = Color(0xFF121212).copy(alpha = 0.6f),
                                fontWeight = FontWeight.Medium,
                                lineHeight = 20.sp,
                                letterSpacing = 1.sp
                            )
                        }
                        ///////////////////// Card Details ///////////////////////////
                        Row(
                            modifier = Modifier.padding(top = 24.dp)
                        ) {
                            Text(
                                text = "Details",
                                fontFamily = IbmPlexSans,
                                fontSize = 18.sp,
                                color = PrimaryTextColor.copy(alpha = 0.87f),
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        ////////////////////////////////////////////////
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            CardDetails(
                                modifier = Modifier.weight(1f),
                                detailValue = "1000 V",
                                detailLabel = "Temperature",
                                icon = painterResource(R.drawable.temperature_icon)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            CardDetails(
                                modifier = Modifier.weight(1f),
                                detailValue = "3 Sparks",
                                detailLabel = "Time",
                                icon = painterResource(R.drawable.timer_icon)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            CardDetails(
                                modifier = Modifier.weight(1f),
                                detailValue = "1M 12K",
                                detailLabel = "No. of deaths",
                                icon = painterResource(R.drawable.evil_icon)
                            )
                        }
                        /////////////////// Preparation method /////////////////////////////
                        Box(
                            modifier = Modifier.padding(top = 24.dp)
                        ) {
                            Column(
                            ) {
                                Text(
                                    text = "Preparation method",
                                    fontFamily = IbmPlexSans,
                                    fontSize = 18.sp,
                                    color = PrimaryTextColor.copy(alpha = 0.87f),
                                    fontWeight = FontWeight.Medium,
                                    lineHeight = 32.sp,
                                    letterSpacing = 1.sp
                                )
                                PreparationMethodDetails(
                                    number = "1",
                                    stepDetails = "Put the pasta in a toaster."
                                )
                                PreparationMethodDetails(
                                    number = "2",
                                    stepDetails = "Pour battery juice over it."
                                )
                                PreparationMethodDetails(
                                    number = "3",
                                    stepDetails = "Wait for the spark to ignite."
                                )
                                PreparationMethodDetails(
                                    number = "4",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "5",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "6",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "7",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "8",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "9",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "10",
                                    stepDetails = "Serve with an insulating glove."
                                )
                                PreparationMethodDetails(
                                    number = "11",
                                    stepDetails = "Serve with an insulating glove."
                                )
                            }
                        }

                    }
                }
                ////////////////////////////////////////////////

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp, bottom = 8.dp, end = 25.dp),
                horizontalArrangement = Arrangement.End
            ) {

                Image(
                    painter = painterResource(R.drawable.electric_pasta),
                    contentDescription = "Electric Pasta",
                    modifier = Modifier
                        .size(width = 188.dp, height = 168.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 15.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF226993))
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Add to cart",
                        fontFamily = IbmPlexSans,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        letterSpacing = 1.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White.copy(alpha = 0.87f),
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .size(5.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(color = Color.White.copy(alpha = 0.38f))
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "3 cheeses",
                            fontFamily = IbmPlexSans,
                            fontSize = 14.sp,
                            letterSpacing = 1.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "5 cheeses",
                            fontFamily = IbmPlexSans,
                            fontSize = 12.sp,
                            letterSpacing = 1.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium,
                            textDecoration = TextDecoration.LineThrough,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
//    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240",
//    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
)
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}