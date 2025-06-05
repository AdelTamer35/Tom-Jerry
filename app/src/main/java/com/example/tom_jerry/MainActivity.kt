package com.example.tom_jerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tom_jerry.screen.TomAccountScreen

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
//    TomKitchenScreen()
    TomAccountScreen()
}