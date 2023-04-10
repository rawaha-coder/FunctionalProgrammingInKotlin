

fun main() {

    println(eagerEvenSequence(4))

    val evenSequence = evenPositiveStream()

    7.times {
        println(evenSequence())
    }

    val fiboSeq = fibo()
    10.times {
        print("${fiboSeq()} ")
    }
}

fun eagerEvenSequence(n: Int): List<Int> = List(n) { i -> i * 2 }

fun evenPositiveStream(): () -> Int {
    var count = -2
    return { count += 2; count }
}

fun fibo(): () -> Int {
    var first = 0
    var second = 1
    var count = 0
    return {
        val next = when (count) {
            0 -> 0
            1 -> 1
            else -> {
                val ret = first + second
                first = second
                second = ret
                ret
            }
        }
        count++
        next
    }
}

