fun <A, B> Fun<A, B>.liftW(
    log: (A, B) -> String
): Writer<A, B> =
    { a: A ->
        val b = this(a)
        b to log(a, b)
    }

fun main() {
    val shiftLeftAndLog = ::shiftLeft.liftW { a, _ ->
        "Shift Left $a"
    }
    val notAndLog = ::shiftLeft.liftW{ a, _ ->
        "Negate $a"
    }
    val shiftLeftAndNotAndLog = notAndLog after shiftLeftAndLog
    println(shiftLeftAndNotAndLog(10).second)
}