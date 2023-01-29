package ru.kotlin.otuskotlin.modul1.m1l3

class Square(val value: Int): Figure {
    override fun area(): Int {
        return value * value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Square

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value
    }

    override fun toString(): String {
        return "Square(value=$value)"
    }
}