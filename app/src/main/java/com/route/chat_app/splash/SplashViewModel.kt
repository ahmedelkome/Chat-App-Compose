package com.route.chat_app.splash

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SplashViewModel : ViewModel() {
    val event = mutableStateOf<SplashEvents>(SplashEvents.Idle)

    fun navigate() {
        navigateToLogin()
    }

    private fun navigateToLogin() {
        event.value = SplashEvents.eventToLogin
    }

    private fun navigateToHome() {
        event.value = SplashEvents.eventToHome
    }
}