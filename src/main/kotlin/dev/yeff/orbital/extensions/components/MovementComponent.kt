package dev.yeff.orbital.extensions.components

import dev.yeff.orbital.Game
import dev.yeff.orbital.ecs.Component
import dev.yeff.orbital.ecs.components.TransformComponent
import dev.yeff.orbital.io.Input
import dev.yeff.orbital.io.Keys

class MovementComponent(private val speed: Float) : Component() {
    private lateinit var transformComponent: TransformComponent

    override fun init(game: Game?) {
        transformComponent = parent.getComponent(TransformComponent::class.java)
    }

    override fun update(game: Game?) {
        val kb = Input.getKeyboard()

        if (kb.isKeyDown(Keys.W)) transformComponent.position.y -= speed
        if (kb.isKeyDown(Keys.S)) transformComponent.position.y += speed
        if (kb.isKeyDown(Keys.A)) transformComponent.position.x -= speed
        if (kb.isKeyDown(Keys.D)) transformComponent.position.x += speed
    }
}