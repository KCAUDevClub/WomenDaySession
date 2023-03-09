package com.example.womendayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.womendayapp.ui.theme.WomenDayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WomenDayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}



@Composable
fun BeautyComment(){
    // content of the function
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = ""
        )
        Text(text = "8th March 2023 is a special day",
            modifier = Modifier.padding(top = 4.dp)
        )
        Text(text = "It is the international women's day",
            modifier = Modifier.padding(top = 4.dp)
        )
        Text(
            text = "A global holiday celebrated annually on March 8 as a focal point in the women's rights movement, bringing attention to issues such as gender equality, reproductive rights, and violence and abuse against women. ",
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Preview
@Composable
fun PreBeauty(){
    BeautyComment()
}


