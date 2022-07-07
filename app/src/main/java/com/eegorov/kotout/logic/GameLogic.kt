package com.eegorov.kotout.logic

import android.graphics.Point
import com.eegorov.kotout.entities.Ball
import com.eegorov.kotout.entities.Board
import com.eegorov.kotout.entities.Position

class GameLogic() {

    var ballList = mutableMapOf<Ball, Position>()
    var board = Pair(Board(size = 3, speed = 0), Position(50.toFloat(), 90.toFloat()))

    init {
        ballList[Ball(1, 1, 0, 3)] = Position(25.toFloat(), 50.toFloat())
    }

    fun addBalls(count: Int, source: Ball) {
        for (i in 0..count) {
            ballList[source.copy()] = ballList[source]!!
        }
    }

}