package com.route.chat_app.splash

sealed class SplashEvents {
    data object Idle : SplashEvents()
    data object eventToLogin : SplashEvents()
    data object eventToHome : SplashEvents()
}