package dev.yeff.orbital.extensions

import dev.yeff.orbital.graphics.Color

// Binary operators

operator fun Color.plus(other: Color) = Color(
    this.r + other.r,
    this.g + other.g,
    this.b + other.b,
    this.a + other.a
)

operator fun Color.minus(other: Color) = Color(
    this.r - other.r,
    this.g - other.g,
    this.b - other.b,
    this.a - other.a
)

operator fun Color.times(other: Color) = Color(
    this.r * other.r,
    this.g * other.g,
    this.b * other.b,
    this.a * other.a
)

operator fun Color.div(other: Color) = Color(
    this.r / other.r,
    this.g / other.g,
    this.b / other.b,
    this.a / other.a
)