package dev.yeff.orbital.extensions

import dev.yeff.orbital.math.Vector2f;

// Binary Operators

operator fun Vector2f.plus(second: Vector2f): Vector2f {
    return Vector2f(this.x + second.x, this.y + second.y)
}

operator fun Vector2f.minus(second: Vector2f): Vector2f {
    return Vector2f(this.x - second.x, this.y - second.y)
}

operator fun Vector2f.times(second: Vector2f): Vector2f {
    return Vector2f(this.x * second.x, this.y * second.y)
}

operator fun Vector2f.div(second: Vector2f): Vector2f {
    return Vector2f(this.x / second.x, this.y / second.y)
}