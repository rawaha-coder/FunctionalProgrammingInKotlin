import kotlin.concurrent.thread

@Synchronized
fun syncedMutableIncAndCheck(counter: MutableCounter) {
    randomDelay()
    counter.count++
    randomDelay()
    if (counter.count == 2) {
        println("Completed")
    }
}
fun main() {
    val counter = MutableCounter()
    thread {
        syncedMutableIncAndCheck(counter)
    }
    thread { 
        syncedMutableIncAndCheck(counter)
    }
}