package com.eegorov.kotout.ui.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eegorov.kotout.entities.Ball
import com.eegorov.kotout.logic.GameLogic
import com.eegorov.kotout.mockLogic
import com.eegorov.kotout.ui.theme.KOTOUTTheme

class GameActivity : ComponentActivity() {
    val logic = GameLogic()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            gameLayout(
                logic
            )
        }
    }
}

@Composable
fun gameLayout(logic: GameLogic) {
    KOTOUTTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            BoxWithConstraints {
                logic.ballList.forEach {
                    ballTexture(it.key, it.value)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun gamePreview() {
    gameLayout(mockLogic)
}