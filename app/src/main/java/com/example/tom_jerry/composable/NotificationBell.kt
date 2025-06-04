package com.example.tom_jerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotificationBellIcon(notificationCount: Int) {
    Box(contentAlignment = Alignment.TopEnd) {
        Icon(
            imageVector = Icons.Outlined.Notifications,
            contentDescription = "Notifications",
            modifier = Modifier.size(48.dp) // Adjust size as needed
        )
        if (notificationCount > 0) {
            Box(
                modifier = Modifier
                    .offset(x = (7).dp, y = (-7).dp) // Fine-tune these offsets
                    .size(20.dp) // Adjust size of the badge
                    .clip(CircleShape)
                    .background(Color.Red), // Or your desired badge color
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = notificationCount.toString(),
                    color = Color.White,
                    fontSize = 12.sp // Adjust text size
                )
            }
        }
    }
}