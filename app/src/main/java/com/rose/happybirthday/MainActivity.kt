package com.rose.happybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rose.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Salimia("Monica", "Rose")
                    SalimiaImage("Happy Birthday Monica!", "From Rose")
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    HappyBirthdayTheme {
//        Greeting("Android")
//    }
//}
@Composable
fun Salimia(jina: String, kutoka: String) {
    Column {
        Text(
            text = "Happy Birthday $jina",
            fontSize = 100.sp,
            lineHeight = 120.sp,
            textAlign = TextAlign.Center
            )
        Text(
            text = "From $kutoka",
            fontSize = 50.sp,
            lineHeight = 12.sp,
            modifier= Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End)




        )
    }

}
@Composable
fun SalimiaImage(message: String, From:String, modifier: Modifier=Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F

        )


        SalimiaText(
            message = message,
            from = From,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),

        )
    }
}

@Composable
fun SalimiaText(message: String, from: Any, modifier: Any) {

}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        SalimiaImage("Happy Birthday Monica!", "From Rose")
        Salimia("Monica", "Rose")
    }
}

//@Preview()
//@Composable
//fun SalimiaPreview() {
//    HappyBirthdayTheme {
//        Salimia("Monica", "Rose")
//    }
//
//}

