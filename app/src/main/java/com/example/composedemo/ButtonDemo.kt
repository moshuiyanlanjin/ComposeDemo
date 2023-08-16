package com.example.composedemo

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class ButtonDemo {
}

@Composable
fun ZLButton(){
    Button(onClick = {
        Log.d("zlc","button1")
    }, colors = ButtonDefaults.buttonColors(containerColor= Color.Green)) {
        Icon(imageVector = Icons.Default.Add, contentDescription = null)
        Text(text = "点击")
    }
}