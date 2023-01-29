package ru.kotlin.otuskotlin.modul1.m1l3

import org.junit.Assert
import kotlin.test.Test

sealed interface Base

class ChildA: Base
class ChildB: Base

// Uncomment this to get compilation error
class ChildC : Base


class ObjectsTest {

    @Test
    fun test() {
        val obj: Base = ChildA()

        val result = when(obj) {
            is ChildA -> "a"
            is ChildB -> "b"
            is ChildC -> "c"
        }

        println("result = $result")
        Assert.assertEquals(result, "a")
    }
}
