package com.example.bankingappui.data

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Mert Yazi
 */

data class Currency(
    val name: String,
    val buy: Float,
    val sell: Float,
    val icon: ImageVector
)
