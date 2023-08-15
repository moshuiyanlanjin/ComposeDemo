package com.example.composedemo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

class ImageDemo {
}

@Composable
fun ZLImage(){
    //contentDescription:内容描述
    Column(modifier = Modifier.padding(10.dp)) {
        Image(painter = painterResource(id = R.mipmap.adc),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red),
            contentScale = ContentScale.FillBounds)
        Spacer(modifier = Modifier.height(10.dp))
        Image(painter = painterResource(id = R.mipmap.adc),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red),
            contentScale = ContentScale.FillWidth)
    }


}


@Composable
fun ZLImage2(){
    //Surface：容器，为内部组件添加整体效果，如设置形状：shape,设置边框：border

   // https://u.sanwen.net/subject/qvkgjqqf.html
    var painter = rememberImagePainter(data = "https://u.sanwen.net/subject/qvkgjqqf.html")
    Surface(shape = CircleShape, border = BorderStroke(2.dp, Color.Red)) {
        Image(painter = painterResource(id = R.mipmap.adc),//painter = painter
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red),
            contentScale = ContentScale.FillBounds)
    }

}

@Composable
fun ZLImage3(){
    //矢量图
    Image(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.size(100.dp))
}