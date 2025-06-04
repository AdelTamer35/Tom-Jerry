package com.example.tom_jerry.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_jerry.R
import com.example.tom_jerry.ui.theme.IbmPlexSans
import com.example.tom_jerry.ui.theme.PrimaryTextColor
import com.example.tom_jerry.ui.theme.SecondaryTextColor

@Composable
fun TomCard(
    modifier: Modifier = Modifier,
    productName: String,
    productDetails: String,
    productPhoto: Painter,
    newPrice: String,
    oldPrice: String = ""
) {
    Box(
        modifier = modifier.height((219 + 16).dp)
            .padding(top = 12.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White),
        ) {
            Column(
                modifier = Modifier.padding(
                    start = 8.dp,
                    end = 8.dp,
                    top = 92.dp,
                    bottom = 8.dp
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = productName,
                        color = PrimaryTextColor,
                        fontFamily = IbmPlexSans,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = productDetails,
                        textAlign = TextAlign.Center,
                        color = SecondaryTextColor,
                        fontFamily = IbmPlexSans,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        softWrap = true
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Row() {
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFE9F6FB))
                            .padding(vertical = 7.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier.size(16.dp),
                            painter = painterResource(id = R.drawable.money_bag),
                            contentDescription = "Money Bag"
                        )
                        Row() {
                            Text(
                                text = oldPrice,
                                color = Color(0xFF03578A),
                                fontFamily = IbmPlexSans,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                textDecoration = TextDecoration.LineThrough

                            )
                            Text(
                                text = " $newPrice cheeses",
                                color = Color(0xFF03578A),
                                fontFamily = IbmPlexSans,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    OutlinedIconButton(
                        onClick = {},
                        modifier = Modifier.size(30.dp),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, Color(0xFF03578A)),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.cart_icon),
                            contentDescription = "Cart Icon",
                            modifier = Modifier.size(16.dp),
                            tint = Color(0xFF03578A)
                        )
                    }
                }
            }
        }
        Image(
            painter = productPhoto,
            contentDescription = "Sport Tom image",
            modifier = Modifier
                .height(100.dp)
                .offset(y = (-136).dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTomCard() {
    TomCard(
        productName = "Tom the lover",
        productDetails = "He loves one-sidedly... and is beaten by the other side.",
        productPhoto = painterResource(R.drawable.tom_the_lover),
        oldPrice = "5",
        newPrice = "3"
    )
}