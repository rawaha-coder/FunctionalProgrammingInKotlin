
fun main() {
    val testFunction = { a: Int -> println("Evaluating... $a"); a * 2
    }
    println("Running testFunction 4 times")
    testFunction(2)
    testFunction(2)
    testFunction(2)
    testFunction(3)
    val memoTestingFunction = testFunction.memo() // 3
    println("Running memoTestingFunction 4 times")
    memoTestingFunction(2) // 4
    memoTestingFunction(2)
    memoTestingFunction(2)
    memoTestingFunction(3)
}

fun <A, B> Fun<A, B>.memo(): Fun<A, B> {
    val cache by lazy { mutableMapOf<A, B>() }
    return { a: A ->
        val cached = cache[a]
        if (cached == null) {
            cache[a] = this(a)
        }
        cache[a]!!
    }
}

