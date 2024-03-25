package com.route.chat_app.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.route.chat_app.R
import com.route.chat_app.ui.theme.blue

@Composable
fun LoginButton(title: String, login: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = {
            login
        }, shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(blue)
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = modifier
                .padding(vertical = 10.dp),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.weight(1F))
        Image(
            painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginButtonPrev() {
    LoginButton("Login", {})
}