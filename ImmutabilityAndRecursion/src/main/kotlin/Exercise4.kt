fun noTailRecFactorial(n: Int, fact: Int = 1): Int = when (n) {
        1 -> fact
    else -> noTailRecFactorial(n - 1, n * fact)
}

fun main() {
    val times = 1000000
    println("recursiveFactorial ${chrono(times) {
        recursiveFactorial(50)
    }}")
    println("tailRecFactorial ${chrono(times) {
        tailRecFactorial(50)
    }}")
    println("noTailRecFactorial ${chrono(times) {
        noTailRecFactorial(50)
    }}")
}