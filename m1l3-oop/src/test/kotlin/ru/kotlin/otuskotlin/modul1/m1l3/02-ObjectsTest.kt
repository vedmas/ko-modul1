package ru.kotlin.otuskotlin.modul1.m1l3

import kotlin.test.Test

class ObjectsExample {
    companion object {
        init {
            println("companion inited") // инициализация при загрузке класса ru.kotlin.otuskotlin.modul1.m1l3.ObjectsExample
        }
        fun doSmth() {
            println("companion object")
        }
    }

    object A {
        init {
            println("A inited") // ленивая инициализация при первом обращении к А
        }
        fun doSmth() {
            println("Object A")
        }
    }
}

class ObjectTest {

    @Test
    fun test() {
        ObjectsExample()
        ObjectsExample.doSmth()
        ObjectsExample.A.doSmth()
    }
}