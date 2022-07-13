package dev.yeff.orbital.extensions

import dev.yeff.orbital.Game
import dev.yeff.orbital.ecs.GameObject
import dev.yeff.orbital.ecs.components.TransformComponent
import dev.yeff.orbital.ecs.components.render.RenderShapeComponent
import dev.yeff.orbital.extensions.components.MovementComponent
import dev.yeff.orbital.graphics.Colors
import dev.yeff.orbital.graphics.Shapes
import dev.yeff.orbital.math.Vector2f
import dev.yeff.orbital.scenes.Scene

fun main() {
    val scenes = mapOf<String, Scene>(
        "Main" to object : Scene() {
            private lateinit var obj: GameObject

            override fun init(game: Game?) {
                obj = GameObject(this, "Object")
                obj.addComponent(TransformComponent(game!!.screenCenter, 30.0f))
                obj.addComponent(RenderShapeComponent(Shapes.RECTANGLE, Colors.RED))
                obj.addComponent(MovementComponent(10.0f))

                addGameObject(game, obj)
            }

            override fun update(game: Game?, fps: Float) {

            }

            override fun dispose(game: Game?) {

            }
        }
    )

    val game = Game(
        Vector2f(400.0f, 400.0f),
        "test",
        scenes
    )

    game.start("Main")
}
