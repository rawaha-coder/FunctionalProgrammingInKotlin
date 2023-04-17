import kotlin.concurrent.thread

data class Counter(
    val count: Int = 0
)
fun incAndCheck(counter: Counter): Counter {
    randomDelay()
    val newCounter = Counter(counter.count + 1)
    randomDelay()
    if (newCounter.count == 2) {
        println("Completed")
    }
    return newCounter
}
fun main() {
    val counter = Counter()
    lateinit var counter1: Counter
    val th1 = thread {
        counter1 = incAndCheck(counter)
    }
    th1.join() 
    thread {
        incAndCheck(counter1)
    }
}

//data class MutableCounter(
//    var count: Int = 0
//)
//
//val counter = MutableCounter()
//
//val task = {
//    randomDelay()
//    counter.count++
//    randomDelay()
//    if (counter.count == 2) {
//        println("Completed")
//    }
//}
//
//fun main() { // 5
//    thread(block = task)
//    thread(block = task)
//}