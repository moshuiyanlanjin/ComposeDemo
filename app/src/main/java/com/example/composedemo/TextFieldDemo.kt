package com.example.composedemo

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextFieldDemo {
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnrememberedMutableState")
@Composable
fun ZLTextField(){
    //remember:记录上一次的状态
    Column(modifier = Modifier.padding(10.dp)) {
        var textValue by remember {
            mutableStateOf("")
        }
        //textValue,唯一数据源，只有改变他，textField才会改变
        TextField(value = textValue, onValueChange = {
            textValue = it
        }, modifier = Modifier
            .border(2.dp, Color.Red, RoundedCornerShape(13.dp))
            .size(300.dp, 60.dp),
            shape= RoundedCornerShape(13.dp),

            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,//背景颜色
                focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent//这两个是下划线设置透明
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            },
            
            textStyle = TextStyle.Default.copy(fontSize = 28.sp),
            trailingIcon = {
                Text(text = "@163.com")
            },
            maxLines = 1,

        )
    }

}

@Composable
fun ZLBaseField(){
    var textValue by remember {
        mutableStateOf("")
    }
    BasicTextField(value = textValue, onValueChange = {
        textValue = it
    },
        modifier = Modifier.background(Color.Red).border(2.dp, Color.Gray, RoundedCornerShape(10.dp)),
        decorationBox = {innerTextField->
        Column(modifier = Modifier.fillMaxWidth().height(80.dp).padding(10.dp)) {
            //有他才能显示输入框
            innerTextField()
            //row横向布局
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text(text = "取消")
                Text(text = "确定")
            }
        }
    })
    
    
}