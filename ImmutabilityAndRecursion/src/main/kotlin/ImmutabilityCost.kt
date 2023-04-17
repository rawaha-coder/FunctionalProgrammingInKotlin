import kotlin.concurrent.thread

data class MutableCounter(
    var count: Int = 0
)

fun mutableIncAndCheck(counter: MutableCounter) {
    randomDelay()
    counter.count++
    randomDelay()
    if (counter.count == 2) {
        println("Completed")
    }
}
fun main() {
    val counter = MutableCounter()
    val th1 = thread {
        mutableIncAndCheck(counter)
    }
    th1.join()
    thread { 
        mutableIncAndCheck(counter)
    }
}