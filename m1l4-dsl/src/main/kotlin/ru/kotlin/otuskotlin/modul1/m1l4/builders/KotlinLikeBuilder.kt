@file:Suppress("PackageDirectoryMismatch")

package ru.kotlin.otuskotlin.modul1.m1l4.builders.kotlin


enum class Drink {
    WATER,
    COFFEE,
    TEA,
    NONE
}

abstract class Meal {
    data class Breakfast(
        val eggs: Int,
        val bacon: Boolean,
        val drink: Drink,
        val title: String
    ) : Meal()
}
class KotlinLikeBuilder {
    var eggs = 0
    var bacon = false
    var drink = Drink.NONE
    var title = ""

    fun build(): Meal.Breakfast = Meal.Breakfast(eggs, bacon, drink, title)
}

fun breakfast(block: KotlinLikeBuilder.() -> Unit): Meal.Breakfast {
    val builder = KotlinLikeBuilder()
    builder.block()
    return builder.build()
}

fun main() {
    val breakfast = breakfast {
        eggs = 4
        title = "Cool"
        bacon = true
        drink = Drink.TEA
    }
    println(breakfast)
}