package com.example.composedemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextDemo {
}

@Composable
fun ColinText(){
    //Column线性布局
    Column() {
        //fontWeight:字重，调整字体画笔的宽度
        Text(text = "朱立", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = "朱立", fontSize = 30.sp, fontWeight = FontWeight.Thin)
        Text(text = "朱立", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Red)
    }
}

@Composable
fun ColinPot(){
    //letterSpacing字间距
    //lineHeight：行间距
    Column() {
        Text(text = "今夕何夕兮搴洲中流。" +
                "今日何日兮得与王子同舟。" +
                "蒙羞被好兮不訾诟耻。" +
                "心几烦而不绝兮得知王子。" +
                "山有木兮木有枝。" +
                "心说君兮君不知。" , fontSize = 20.sp)
        //间距
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "大河向东流", fontSize = 20.sp, letterSpacing = 8.sp)
        Text(text = "今夕何夕兮搴洲中流。" +
                "今日何日兮得与王子同舟。" +
                "蒙羞被好兮不訾诟耻。" +
                "心几烦而不绝兮得知王子。" +
                "山有木兮木有枝。" +
                "心说君兮君不知。" , fontSize = 20.sp, letterSpacing = 8.sp, lineHeight = 40.sp)
    }

}


//Preview:可以预览
@Preview
@Composable
fun ColinPoet2(){
    Column(modifier = Modifier.padding(10.dp)) {
        Text(text = "越人歌", fontSize = 26.sp, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        Text(text = "先秦.佚名", fontSize = 14.sp, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Right)
        Text(text = "今夕何夕兮搴洲中流。" +
                "今日何日兮得与王子同舟。" +
                "蒙羞被好兮不訾诟耻。" +
                "心几烦而不绝兮得知王子。" +
                "山有木兮木有枝。" +
                "心说君兮君不知。" , fontSize = 20.sp, letterSpacing = 8.sp, lineHeight = 40.sp)
    }
}