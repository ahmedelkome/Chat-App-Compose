package com.route.chat_app.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.route.chat_app.R
import com.route.chat_app.login.LoginActivity
import com.route.chat_app.ui.theme.ChatAppTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatAppTheme {
                SplashScreen {
                    finish()
                }
            }
        }
    }
}

@Composable
fun SplashScreen(viewModel: SplashViewModel = viewModel(), onFinish: () -> Unit) {
    LaunchedEffect(key1 = Unit) {
        Handler(Looper.getMainLooper()).postDelayed({
            viewModel.navigate()
        }, 2000)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1F))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            alignment = Alignment.Center,
            modifier = Modifier.fillMaxHeight(.2F), contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.weight(1F))
        Image(
            painter = painterResource(id = R.drawable.signature),
            contentDescription = "signature",
            alignment = Alignment.Center,
            modifier = Modifier
                .fillMaxHeight(.2F), contentScale = ContentScale.Crop
        )

    }
    TriggreToLogin(events = viewModel.event.value) {
        onFinish()
    }

}

@Composable
fun TriggreToLogin(
    events: SplashEvents,
    viewModel: SplashViewModel = viewModel(),
    onFinish: () -> Unit
) {
    val context = LocalContext.current
    when (events) {
        SplashEvents.Idle -> {}
        SplashEvents.eventToHome -> {}
        SplashEvents.eventToLogin -> {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
            onFinish()
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SplashPreview() {
    SplashScreen {

    }
}