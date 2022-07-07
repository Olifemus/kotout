package com.eegorov.kotout.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.eegorov.kotout.R

@Composable
fun moveKey(onTap: () -> Unit, left: Boolean) {
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    val res = if (left) R.drawable.left_arrow else R.drawable.right_arrow
    Button(
        onClick = onTap,
        modifier = Modifier.offset(
            x = if (left) screenWidth * 1 / 10 else (screenWidth * 9 / 10),
            y = screenHeight * 9 / 10
        )
    ) {
        Icon(painterResource(res), null)
    }
}