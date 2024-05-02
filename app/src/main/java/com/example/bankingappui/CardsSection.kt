package com.example.bankingappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingappui.data.Card
import com.example.bankingappui.ui.theme.PurpleEnd
import com.example.bankingappui.ui.theme.PurpleStart

/**
 * Created by Mert Yazi
 */
 
 val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "2835 7685 4563 8796",
        cardName = "Business",
        balance = 36.72,
        color = getGradient(PurpleStart, PurpleEnd)
    ),

    Card(
        cardType = "MASTERCARD",
        cardNumber = "5674 9856 4563 5421",
        cardName = "Savings",
        balance = 24.12,
        color = getGradient(PurpleStart, PurpleEnd)
    ),

    Card(
        cardType = "VISA",
        cardNumber = "3465 8735 4653 7634",
        cardName = "School",
        balance = 6.45,
        color = getGradient(PurpleStart, PurpleEnd)
    ),

    Card(
        cardType = "MASTERCARD",
        cardNumber = "8934 5673 8634 5423",
        cardName = "Holiday",
        balance = 68.76,
        color = getGradient(PurpleStart, PurpleEnd)
    )
 )

fun getGradient(
    startColor: Color,
    endColor: Color
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Preview
@Composable
fun CardsSection() {
    LazyRow {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}

@Composable
fun CardItem(
    index: Int
) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }
    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTERCARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }
    
    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = lastItemPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable {}
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = image,
                contentDescription = card.cardName,
                modifier =Modifier.width(60.dp)
            )
            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$ ${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}