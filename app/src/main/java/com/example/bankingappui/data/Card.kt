package com.example.bankingappui.data

import androidx.compose.ui.graphics.Brush

/**
 * Created by Mert Yazi
 */

data class Card(
    val cardType: String,
    val cardNumber: String,
    val cardName: String,
    val balance: Double,
    val color: Brush
)
