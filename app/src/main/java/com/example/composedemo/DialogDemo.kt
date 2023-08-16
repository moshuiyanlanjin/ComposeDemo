package com.example.composedemo

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog

class DialogDemo {
}
@Composable
fun ZLDialog(){
    AlertDialog(onDismissRequest = { 
        
    }, title = {
        Text(text = "弹出框")
    }, text = {
        Text(text = "这是Compose的弹窗")
    }, dismissButton = {
        Text(text = "取消")
    }, confirmButton = {
        Text(text = "确认")
    })
}

@Composable
fun ZLDialog1(){
    Dialog(onDismissRequest = {  },

        content = {
            Text(text = "测试")
        }
    )
}