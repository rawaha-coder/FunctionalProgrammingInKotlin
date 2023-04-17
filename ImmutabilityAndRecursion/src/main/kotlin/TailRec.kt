fun imperativeFactorial(n: Int): Int {
    var result = 1
    for (value in 2..n) {
        result *= value
    }
    return result
}
fun main() {
    println(imperativeFactorial(10))
    println(recursiveFactorial(10))
    println(tailRecFactorial(10))

}

fun recursiveFactorial(n: Int): Int = when (n) {
    1 -> 1
    else -> n * recursiveFactorial(n - 1)
}

tailrec fun tailRecFactorial(n: Int, fact: Int = 1): Int = when (n) {
    1 -> fact
    else -> tailRecFactorial(n - 1, n * fact)
}