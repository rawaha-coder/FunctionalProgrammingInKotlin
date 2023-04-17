
tailrec fun tailRecFib(n: Int, a: Int = 0, b: Int = 1): Int =
    when (n) {
    0 -> a
    1 -> b
    else -> tailRecFib(n - 1, b, a + b)
}

fun noTailRecFib(n: Int): Int = when (n) {
    0 -> 0
    1 -> 1
    else -> noTailRecFib(n - 1) + noTailRecFib(n - 2)
}

fun main() {
    println(tailRecFib(4))
    println(noTailRecFib(4))

    println(chrono {
        noTailRecFib(40)
    })
    println(chrono {
        tailRecFib(40)
    })
}

