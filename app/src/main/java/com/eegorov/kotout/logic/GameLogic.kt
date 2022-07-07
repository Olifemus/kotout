package com.eegorov.kotout.logic

import android.graphics.Point
import com.eegorov.kotout.entities.Ball
import com.eegorov.kotout.entities.Position

class GameLogic() {

    var ballList = mutableMapOf<Ball, Position>()

    init {
        ballList[Ball(1, 1, 0, 3)] = Position(25.toFloat(), 50.toFloat())
    }

    fun addBalls(count: Int, source: Ball) {
        for (i in 0..count) {
            ballList[source.copy()] = ballList[source]!!
        }
    }

}