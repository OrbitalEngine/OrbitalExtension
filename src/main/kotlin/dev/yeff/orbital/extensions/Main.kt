package dev.yeff.orbital.extensions

import dev.yeff.orbital.math.Vector2f

fun main() {
    var first = Vector2f(100.0f, 100.0f)
    var second = Vector2f(20.0f, 20.0f);
    var third = Vector2f(100.0f, 100.0f)

    println(first + second)
    println(first - second)
    println(first * second)
    println(first / second)
    println(-first)
    first++
    println(first)
    first--
    println(first)
}
