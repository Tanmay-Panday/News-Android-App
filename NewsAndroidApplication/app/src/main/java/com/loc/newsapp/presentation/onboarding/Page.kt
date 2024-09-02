package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

// data class to hold information for each onboarding page
data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Discover",
        description = "Stay updated with the latest news from around the world.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Personalize",
        description = "Save your favorite sources and receive notifications when new articles are published.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Share",
        description = "Share your favorite articles with your friends and family.",
        image = R.drawable.onboarding3
    )
)