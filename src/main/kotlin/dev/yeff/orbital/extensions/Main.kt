package dev.yeff.orbital.extensions

import dev.yeff.orbital.math.Vector2f

fun main() {
    val first = Vector2f(100.0f, 100.0f)
    val second = Vector2f(20.0f, 20.0f);
    val third = Vector2f(100.0f, 100.0f)

    println(first + second)
    println(first - second)
    println(first * second)
    println(first / second)
    println(first == third)
}

