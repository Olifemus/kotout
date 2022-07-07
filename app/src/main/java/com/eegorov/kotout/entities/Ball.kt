package com.eegorov.kotout.entities

class Ball(var power: Int, var speed: Int, var angle: Int, var size: Int) {
    fun changePower(value: Int): Unit {
        power += value
    }

    fun changeSpeed(value: Int): Unit {
        speed += value
    }

    fun changeAngle(value: Int): Unit {
        angle = value
    }

    fun changeSize(value: Int): Unit {
        size+=value
    }

    fun copy(): Ball {
        return Ball(this.power, this.speed, this.angle, this.size)
    }
}