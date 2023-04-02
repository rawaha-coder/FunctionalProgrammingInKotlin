
var count = 0
fun impure(value: Int): Int {
    count++
    return value + count
}

fun addOneAndLog(x: Int): Int {
    val result = x + 1
    println("New Value is $result")
    return result
}

fun addOneAndLogPure(x: Int): Pair<Int, String> {
    val result = x + 1
    return result to "New Value is $result"
}