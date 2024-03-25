package com.route.chat_app.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.route.chat_app.ui.theme.blue
import com.route.chat_app.ui.theme.gray
import com.route.chat_app.ui.theme.lightBlack
import com.route.chat_app.ui.theme.lightGray

@Composable
fun ChatAuthTextField(
    state: MutableState<String>,
    lable: String,
    error: String?,
    modifier: Modifier = Modifier
) {
    Column {
        TextField(
            value = state.value, onValueChange = {
                state.value = it
            }, label = {
                Text(text = lable, fontSize = 12.sp, fontWeight = FontWeight.Normal)
            }, colors = TextFieldDefaults.colors(
                focusedIndicatorColor = blue,
                unfocusedIndicatorColor = lightGray,
                focusedTextColor = lightBlack,
                errorTextColor = Color.Red,
                focusedLabelColor = gray,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ), modifier = modifier.fillMaxWidth()
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TextFieldPrev() {

}