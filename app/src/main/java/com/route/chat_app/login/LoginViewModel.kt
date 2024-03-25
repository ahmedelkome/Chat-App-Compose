package com.route.chat_app.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var email = mutableStateOf<String>("")
    var emailError = mutableStateOf<String?>("")
    var password = mutableStateOf<String>("")
    var passwordError = mutableStateOf<String?>("")
}