package com.route.chat_app.utils

import androidx.compose.foundation.Image
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.route.chat_app.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatAppBar(title: String, NavigationIcon: (() -> Unit)? = null) {
    CenterAlignedTopAppBar(title = {
        Text(
            text = title,
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    },
        navigationIcon = {
            if (NavigationIcon != null)
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_back
                    ), contentDescription = stringResource(R.string.back)
                )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Transparent)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ChatAppBarPrev() {
    ChatAppBar("Login")
}