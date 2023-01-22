package ru.kotlin.otuskotlin.modul1.m1l4

import ru.otus.otuskotlin.marketplace.builders.java.BreakfastBuilder
import ru.otus.otuskotlin.marketplace.builders.java.Drink

fun main() {
    println("HW!")

    val builder = BreakfastBuilder()
        .withBacon(true)
        .withEggs(12)
        .withDrink(Drink.COFFEE)
        .withTitle("Title")

    builder.withEggs(120)



    println(builder.build())
}