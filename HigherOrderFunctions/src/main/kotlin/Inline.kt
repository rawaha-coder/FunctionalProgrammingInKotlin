inline fun executor(noinline fn: () -> Unit) {
    fn()
}
fun main() {
    executor { println("Hello World!") }
}