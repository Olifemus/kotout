package com.eegorov.kotout.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.eegorov.kotout.entities.Ball
import com.eegorov.kotout.entities.Position

@Composable
fun ballTexture(ball: Ball, position: Position) {
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    val ballSize = (24 / 3 * ball.size).dp
    Box(
        modifier = Modifier
            .offset(
                x = (screenWidth - ballSize) / 100 * position.relativeX,
                y = (screenHeight - ballSize) / 100 * position.relativeY,
            )
            .size(ballSize)
            .clip(CircleShape)
            .background(Color.Magenta)
    )
}