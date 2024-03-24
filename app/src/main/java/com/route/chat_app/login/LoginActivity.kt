package com.route.chat_app.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.route.chat_app.R
import com.route.chat_app.ui.theme.LoginActivityTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LoginActivityTheme {
                enableEdgeToEdge()
                homeActivityDesign()
            }

        }
    }
}

@Composable
fun homeActivityDesign() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "Imagebackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 62.dp, start = 158.dp, end = 158.dp)
            )
            Spacer(modifier = Modifier.height(200.dp))
            Text(
                text = "Welcome back!",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp,
                modifier = Modifier.padding(start = 20.dp, end = 161.dp)
            )

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun homeActivityPrev() {
    homeActivityDesign()

}

