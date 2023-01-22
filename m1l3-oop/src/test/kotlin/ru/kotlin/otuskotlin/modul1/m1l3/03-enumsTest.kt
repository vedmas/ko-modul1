package ru.kotlin.otuskotlin.modul1.m1l3

import org.junit.Assert
import kotlin.test.Test

enum class SimpleEnum {
    LOW,
    HIGH
}

enum class EnumWithData(
    val level: Int,
    val description: String) {

    LOW(10, "low level"),
    HIGH(100, "high level")
}

enum class MyEnum : Iterable<MyEnum> {
    FOO{override fun doSmth() {
        println("do foo")
    }},
    BAR{
        override fun doSmth() {
            println("do bar")
        }
    };

    abstract fun doSmth()
    override fun iterator(): Iterator<MyEnum> = listOf(FOO).iterator()
}

class EnumsTest {

    @Test
    fun test() {
        var e = SimpleEnum.LOW
        println(e)
        e = SimpleEnum.valueOf("HIGH")
        println(e)
        println("ordinal = ${e.ordinal}")
        Assert.assertEquals(e.ordinal, 1)
        println(SimpleEnum.values().contentToString())
    }
}