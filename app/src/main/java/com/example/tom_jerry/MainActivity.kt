package com.example.tom_jerry

import android.R.attr.background
import android.R.id.background
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tom_jerry.screen.JerryStoreScreen
import com.example.tom_jerry.screen.TomKitchenScreen
import com.example.tom_jerry.ui.theme.JerryStoreBackground
import com.example.tom_jerry.ui.theme.Tom_JerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TomJerryApp()
        }
    }
}

@Preview
@Composable
fun TomJerryApp() {
//    JerryStoreScreen()
    TomKitchenScreen()
}