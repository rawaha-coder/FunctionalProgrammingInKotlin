fun add(x: Int, y: Int): Int {
    val result = x + y
    println("add")
    return result
}
fun triple(x: Int): Int {
    val result = add(add(x, x), x)
    println("triple")
    return result
}
fun divide(x: Int, y: Int): Int {
    val result = x / y
    println("divide")
    return result
}
fun average(x: Int, y: Int): Int {
    val result = divide(add(x, y), 2)
    println("average")
    return result
}

fun main() {
    println("******** Evaluation *********")
    triple(average(2, 4))
}