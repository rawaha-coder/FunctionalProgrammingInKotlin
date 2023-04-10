
fun e(): () -> Double {
    var currentSum = 1.0 // 1
    var n = 1
    tailrec fun factorial(n: Int, tmp: Int): Int = // 2
        if (n == 1) tmp else factorial(n - 1, n * tmp)
    return {
        currentSum += 1.0 / factorial(n++, 1).toDouble() // 3
        currentSum
    }
}

fun main() {
    val e = e()
    10.times {
        println(e())
    }

    val e1 = fastE()
    10.times {
        println(e1())
    }
}

fun fastE(): () -> Double {
    var currentSum = 1.0
    val fact = factSeq()
    return {
        currentSum += 1.0 / fact().toDouble()
        currentSum
    }
}

fun factSeq(): () -> Int {
    var partial = 1
    var n = 1
    return {
        partial *= n++
        partial
    }
}