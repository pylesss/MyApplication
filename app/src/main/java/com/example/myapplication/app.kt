package com.example.myapplication

class app {
}

fun main() {
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}

class Dice{
    val sides = 6

    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}