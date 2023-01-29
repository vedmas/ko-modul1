package coroutinesScope

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun CoroutineScope.suspendingCall(ctx: CoroutineContext) = launch(ctx) {
    println("Start_delay")
    delay(500)
    println("Foo bar")
}

fun CoroutineScope.blockingCall(ctx: CoroutineContext) = launch(ctx) {
    runBlocking {
        println("Taking delay")
        delay(500)
        println("Foo bar")
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Main start")
    val ctx = newSingleThreadContext("MyOneThread")
    runBlocking {
        repeat(5) { // repeat это как цикл for т.е. запустить то, что внутри 5 раз
            suspendingCall(ctx)
//            blockingCall(ctx)
        }
    }
    println("Main finish")
}