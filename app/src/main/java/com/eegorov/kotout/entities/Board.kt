package com.eegorov.kotout.entities

class Board(var size: Int, var speed: Int) {


    fun changeSize(value: Int): Unit {
        size += value
    }

    fun changeSpeed(value: Int): Unit {
        speed += value
    }
}