package dev.yeff.orbital.extensions

import dev.yeff.orbital.math.Vector2f;

// Binary Operators

operator fun Vector2f.plus(second: Vector2f): Vector2f = Vector2f(this.x + second.x, this.y + second.y)

operator fun Vector2f.minus(second: Vector2f): Vector2f = Vector2f(this.x - second.x, this.y - second.y)

operator fun Vector2f.times(second: Vector2f): Vector2f = Vector2f(this.x * second.x, this.y * second.y)

operator fun Vector2f.div(second: Vector2f): Vector2f = Vector2f(this.x / second.x, this.y / second.y)

operator fun Vector2f.rem(second: Vector2f): Vector2f = Vector2f(this.x % second.x, this.y % second.y)

// Unary operators

operator fun Vector2f.unaryMinus(): Vector2f = Vector2f(-this.x, -this.y)

// Increment and Decrement

operator fun Vector2f.inc(): Vector2f = Vector2f(this.x + 1, this.y + 1)

operator fun Vector2f.dec(): Vector2f = Vector2f(this.x - 1, this.y - 1)