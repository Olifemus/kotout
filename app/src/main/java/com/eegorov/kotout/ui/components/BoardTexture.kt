package com.eegorov.kotout.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.eegorov.kotout.entities.Board
import com.eegorov.kotout.entities.Position

@Composable
fun boardTexture(boardDesc: Pair<Board, Position>) {
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    val boardHeight = (24 / 3 * boardDesc.first.size).dp
    val boardWidth = (72 / 3 * boardDesc.first.size).dp
    Box(
        modifier = Modifier
            .offset(
                x = (screenWidth - boardWidth) / 100 * boardDesc.second.relativeX,
                y = (screenHeight - boardHeight) / 100 * boardDesc.second.relativeY,
            )
            .background(Color.Black, RoundedCornerShape(12.dp))
            .size(height = boardHeight, width = boardWidth)
    )
}